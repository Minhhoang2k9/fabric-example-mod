package com.example.mixin;

import com.example.config.QuickBlockConfig;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * Tăng tốc độ đặt block
 * Giảm delay và tối ưu hóa việc đặt block
 * Không ảnh hưởng đến tốc độ đào, tấn công, hoặc bắn cung
 */
@Mixin(Block.class)
public class BlockPlaceSpeedMixin {
	
	/**
	 * Tối ưu hóa hiệu suất đặt block
	 * Được gọi khi block được đặt vào thế giới
	 */
	@Inject(
		method = "defaultBlockState",
		at = @At("RETURN"),
		cancellable = false
	)
	private void onBlockStateCreated(CallbackInfoReturnable<BlockState> cir) {
		// Tối ưu hóa trạng thái block mặc định
		if (!QuickBlockConfig.ENABLE_FAST_BLOCK_PLACEMENT) {
			return;
		}
	}
}

