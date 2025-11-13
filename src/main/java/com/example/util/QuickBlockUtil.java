package com.example.util;

import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;

/**
 * Utility class cho Quick Block Mod
 * Chứa các phương thức tiện ích để kiểm tra item và tối ưu hóa
 */
public class QuickBlockUtil {
	
	/**
	 * Kiểm tra xem item có phải là loại thuốc không
	 */
	public static boolean isPotion(ItemStack item) {
		String itemName = item.getItem().toString().toLowerCase();
		return itemName.contains("potion");
	}
	
	/**
	 * Kiểm tra xem item có phải là trai kinh nghiệm không
	 */
	public static boolean isExperienceBottle(ItemStack item) {
		String itemName = item.getItem().toString().toLowerCase();
		return itemName.contains("experience_bottle");
	}
	
	/**
	 * Kiểm tra xem hai ItemEntity có thể hợp nhất được không
	 */
	public static boolean canMerge(ItemEntity item1, ItemEntity item2) {
		ItemStack stack1 = item1.getItem();
		ItemStack stack2 = item2.getItem();
		
		// Phải cùng loại item
		if (!stack1.getItem().equals(stack2.getItem())) {
			return false;
		}
		
		// Phải có không gian chứa
		if (stack1.getCount() + stack2.getCount() > stack1.getMaxStackSize()) {
			return false;
		}
		
		return true;
	}
	
	/**
	 * Lấy ID của item dưới dạng string
	 */
	public static String getItemId(ItemStack item) {
		return item.getItem().toString();
	}
	
	/**
	 * Kiểm tra xem item có được ưu tiên nén nhanh không
	 */
	public static boolean shouldFastMerge(ItemStack item) {
		return isPotion(item) || isExperienceBottle(item);
	}
}
