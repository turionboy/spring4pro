/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springforpro.chptr2;

public interface MessageRenderer {
	public void render();
	public void setMessageProvider(MessageProvider mp);
	public MessageProvider getMessageProvider();
}
