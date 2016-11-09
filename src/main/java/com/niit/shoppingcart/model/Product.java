package com.niit.shoppingcart.model;

import org.springframework.stereotype.Component;
@Component
public class Product {
	    
	    private String proid;
	    
		public String getProid() {
			return proid;
		}

		public void setProid(String proid) {
			this.proid = proid;
		}

		public String getProname() {
			return proname;
		}

		public void setProname(String proname) {
			this.proname = proname;
		}

		private String proname;
	}


