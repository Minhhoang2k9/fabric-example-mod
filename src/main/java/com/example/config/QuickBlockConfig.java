package com.example.config;

/**
 * Cấu hình cho Quick Block Mod
 * Chứa các tùy chọn để điều chỉnh hiệu suất và tính năng
 */
public class QuickBlockConfig {
	
	// Tăng tốc độ đặt block
	public static final boolean ENABLE_FAST_BLOCK_PLACEMENT = true;
	
	// Độ trễ giữa các lần đặt block (tick) - mặc định là 5, giảm xuống 2
	public static final int BLOCK_PLACE_DELAY = 2;
	
	// Nén vật thể nhanh
	public static final boolean ENABLE_ITEM_MERGE = true;
	
	// Độ trễ hợp nhất vật thể (tick) - mặc định là 40, giảm xuống 8
	public static final int ITEM_MERGE_DELAY = 8;
	
	// Giảm lag - tối ưu hóa tile entity ticking
	public static final boolean ENABLE_OPTIMIZATION = true;
	
	// Chỉ áp dụng cho các item cụ thể (thuốc, trai kinh nghiệm)
	public static final boolean ONLY_MERGE_SPECIFIC_ITEMS = true;
	
	// Các loại item được nén nhanh (theo namespace)
	public static final String[] FAST_MERGE_ITEMS = {
		"minecraft:experience_bottle",  // Trai kinh nghiệm
		"minecraft:glass_bottle",        // Chai thủy tinh
		"minecraft:potion",              // Thuốc
		"minecraft:splash_potion",       // Thuốc tạm dừng
		"minecraft:lingering_potion"     // Thuốc còn lại
	};
	
	// Không áp dụng cho:
	// - Đào nhanh (MiningSpeedBoost)
	// - Tấn công nhanh (AttackSpeedBoost)
	// - Bắn cung nhanh (BowSpeedBoost)
	
	public static boolean isFastMergeItem(String itemId) {
		if (!ONLY_MERGE_SPECIFIC_ITEMS) {
			return true;
		}
		
		for (String item : FAST_MERGE_ITEMS) {
			if (item.equalsIgnoreCase(itemId)) {
				return true;
			}
		}
		return false;
	}
}
