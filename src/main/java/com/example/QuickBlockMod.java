package com.example;

import com.example.event.QuickBlockEventListener;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuickBlockMod implements ModInitializer {
	public static final String MOD_ID = "quickblock";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Quick Block Mod đã được tải! Đặt block nhanh hơn và giảm lag!");
		
		// Đăng ký các event listener
		QuickBlockEventListener.registerEvents();
		
		LOGGER.info("Các tính năng đã được kích hoạt:");
		LOGGER.info("  ✓ Đặt block nhanh hơn");
		LOGGER.info("  ✓ Nén vật thể nhanh (thuốc, trai kinh nghiệm)");
		LOGGER.info("  ✓ Giảm lag cho game");
	}
}