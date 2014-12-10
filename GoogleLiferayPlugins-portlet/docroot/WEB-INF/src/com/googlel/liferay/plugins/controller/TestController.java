package com.googlel.liferay.plugins.controller;

import java.util.Date;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.googlel.*;
import com.googlel.liferay.model.Employee;
import com.googlel.liferay.model.impl.EmployeeImpl;
import com.googlel.liferay.service.EmployeeLocalService;
import com.googlel.liferay.service.EmployeeLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;


@Controller(value = "MyController")  
@RequestMapping("VIEW")  
public class TestController {
	
	 @RenderMapping  
	  public String handleRenderRequest(RenderRequest request,RenderResponse response,Model model){  
		 Employee emp=new EmployeeImpl();
		 emp.setEmpName("Rahul Rabhadiya");
		 emp.setEmpType("Adhoc");
		 
		 try {
			EmployeeLocalServiceUtil.addEmployee(emp);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/* 
		 Test t=new TestImpl();
		 t.setFooId(new Long(1));
		 t.setCompanyId(1);
		 t.setCreateDate(new Date());
		 
		 try {
			TestLocalServiceUtil.addTest(t);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 */
		 
	    return "myview"; 

}
	 
}
