package net.qzlife.call.pojo.dto;

import java.util.Collection;

/**
 * 分页对象封装
 * 
 * @author tay
 *
 * @param <T>
 */
public class PageResult<T> {
	// 当前页
	private int currentPage;
	// 每页显示多少数据
	private int pageSize;
	// 总页数
	private int totalPage;
	// 总记录数
	private int totalRows;
	// 数据列表
	private Collection<T> list;

	private PageResult(PageBuilder<T> builder) {
		this.currentPage = builder.currentPage;
		this.pageSize = builder.pageSize;
		this.totalRows = builder.totalRows;
		this.totalPage = builder.totalPage;
		this.list = builder.list;
	}

	public static class PageBuilder<T> {
		// 当前页
		private int currentPage;
		// 每页显示多少数据
		private int pageSize = 10;
		// 总页数
		private int totalPage;
		// 总记录数
		private int totalRows;
		// 数据列表
		private Collection<T> list;

		public PageBuilder<T> currentPage(int currentPage) {
			this.currentPage = currentPage;
			return this;
		}

		public PageBuilder<T> pageSize(int pageSize) {
			this.pageSize = pageSize;
			return this;
		}

		public PageBuilder<T> totalRows(int totalRows) {
			this.totalRows = totalRows;
			return this;
		}

		public PageBuilder<T> list(Collection<T> list) {
			this.list = list;
			return this;
		}

		public PageResult<T> build() {
			/* Czz:总条数小于10，总页码为1 */
			if (this.totalRows < this.pageSize) {
				this.totalPage = 1;
			}
			this.totalPage = this.totalRows / this.pageSize;
			if (this.totalRows % this.pageSize != 0)
				this.totalPage += 1;
			return new PageResult<T>(this);
		}
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public int getTotalRows() {
		return totalRows;
	}

	public Collection<T> getList() {
		return list;
	}

}
