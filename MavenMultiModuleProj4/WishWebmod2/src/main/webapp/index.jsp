<%@page import="com.mj.service.WishMessageService" %>
Wish Message is ::<%=new WishMessageService().getWishMessage("Manoj") %>
