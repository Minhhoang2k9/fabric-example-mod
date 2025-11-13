package com.example.mixin;

import com.example.config.QuickBlockConfig;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

/**
 * Nén vật thể nhanh hơn - giảm thời gian để các item tự động hợp nhất
 * Chỉ áp dụng cho các loại vật thể cụ thể như thuốc và trai kinh nghiệm
 */
@Mixin(ItemEntity.class)
public abstract class ItemMergeMixin {
	
	@Shadow public abstract ItemStack getItem();
	
	/**
	 * Tăng tốc độ hợp nhất item bằng cách sửa age field
	 * Sử dụng @Shadow accessor để truy cập age một cách an toàn
	 */
	@Shadow private int age;
	
	/**
	 * Kiểm tra và tăng age nếu item đó được ưu tiên nén
	 */
	public void tickFastMerge() {
		if (!QuickBlockConfig.ENABLE_ITEM_MERGE) {
			return;
		}
		
		ItemStack item = this.getItem();
		String itemId = item.getItem().toString();
		
		// Chỉ áp dụng cho các item cụ thể
		if (QuickBlockConfig.isFastMergeItem(itemId)) {
			// Tăng age để item hợp nhất nhanh hơn
			this.age += 3;
		}
	}
}

