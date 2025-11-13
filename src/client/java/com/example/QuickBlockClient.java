package com.example;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import org.lwjgl.glfw.GLFW;

public class QuickBlockClient implements ClientModInitializer {
	
	@Override
	public void onInitializeClient() {
		QuickBlockMod.LOGGER.info("Quick Block Client đã được khởi tạo!");
		
		// Đăng ký sự kiện tick để xử lý keyboard
		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			// Các tính năng client sẽ được xử lý tại đây
		});
	}
}