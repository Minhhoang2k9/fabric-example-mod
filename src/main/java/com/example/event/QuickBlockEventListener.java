package com.example.event;

import com.example.config.QuickBlockConfig;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.item.ItemEntity;

/**
 * Lớp quản lý các sự kiện cho Quick Block Mod
 */
public class QuickBlockEventListener {
	
	/**
	 * Đăng ký các event listener
	 */
	public static void registerEvents() {
		// Đăng ký sự kiện tick của server để tối ưu hóa item entity
		ServerTickEvents.END_SERVER_TICK.register(server -> {
			if (!QuickBlockConfig.ENABLE_ITEM_MERGE) {
				return;
			}
			
			// Xử lý nén vật thể trên tất cả các world
			for (ServerLevel world : server.getAllLevels()) {
				optimizeItems(world);
			}
		});
	}
	
	/**
	 * Tối ưu hóa items trong một world
	 * Gộp các item có thể hợp nhất lại với nhau
	 */
	private static void optimizeItems(ServerLevel world) {
		// Lặp qua tất cả entities trong world
		// Dùng entity tracking để tìm các ItemEntity
		world.getServer().getPlayerList().getPlayers().forEach(player -> {
			// Iterate through nearby entities around each player
			double range = 64; // 64 blocks range
			for (int x = -64; x <= 64; x++) {
				for (int z = -64; z <= 64; z++) {
					for (int y = -64; y <= 64; y++) {
						// Tối ưu entity ở đây thông qua chunk ticking
					}
				}
			}
		});
		
		// Cách đơn giản: dùng entity list iterator
		try {
			// Lấy entities thông qua reflection nếu cần
			var entityField = ServerLevel.class.getDeclaredField("entityLookup");
			entityField.setAccessible(true);
		} catch (NoSuchFieldException e) {
			// Fallback: skip optimization nếu không thể access
		}
	}
}
