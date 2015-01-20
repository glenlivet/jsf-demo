/**
 * 
 */


/**
 * 标准的 搜索栏 按钮栏 表格 页面，拉升表格 填充整个页面
 */
var initCommonTablePage = function(){
	var windowHeight = $(window).innerHeight();
	var searchboxHeight = $('.ik-searcharea').outerHeight();
	var menubarHeight = $('.ik-menubar').outerHeight();
	var paginatorHeight = $('.ik-datatable .ui-paginator').outerHeight();
	$('.ik-datatable .ui-datatable-tablewrapper').height(windowHeight - searchboxHeight - menubarHeight
			- paginatorHeight - 20)
			.css('overflow', 'auto')
			.css('overflow-x', 'auto');
};