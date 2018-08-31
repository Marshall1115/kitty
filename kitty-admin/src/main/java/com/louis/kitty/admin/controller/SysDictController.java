package com.louis.kitty.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.louis.kitty.admin.model.SysDict;
import com.louis.kitty.admin.sevice.SysDictService;
import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.core.page.PageRequest;

@RestController
@RequestMapping("dict")
public class SysDictController {

	@Autowired
	private SysDictService sysDictService;
	
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody SysDict record) {
		return HttpResult.ok(sysDictService.save(record));
	}

	@PostMapping(value="/update")
	public HttpResult update(@RequestBody SysDict record) {
		return HttpResult.ok(sysDictService.update(record));
	}

	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody SysDict record) {
		return HttpResult.ok(sysDictService.delete(record));
	}

	@PostMapping(value="/deleteBatch")
	public HttpResult delete(@RequestBody List<SysDict> records) {
		return HttpResult.ok(sysDictService.delete(records));
	}

	@GetMapping(value="/findById")
	public HttpResult findById(Long id) {
		return HttpResult.ok(sysDictService.findById(id));
	}

	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(sysDictService.findPage(pageRequest));
	}
}
