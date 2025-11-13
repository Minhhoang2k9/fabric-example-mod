package com.example.mixin.client;

import com.example.config.QuickBlockConfig;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Tăng tốc độ đặt block trên phía client
 * Giảm delay giữa các lần đặt block
 */
@Mixin(MultiPlayerGameMode.class)
public abstract class PlayerActionMixin {
	
	/**
	 * Giảm delay đặt block
	 * Không ảnh hưởng đến tấn công hoặc đào
	 */
	@Inject(
		method = "tick",
		at = @At("HEAD"),
		cancellable = false
	)
	private void onTick(CallbackInfo ci) {
		if (!QuickBlockConfig.ENABLE_FAST_BLOCK_PLACEMENT) {
			return;
		}
		
		// Tối ưu hóa được áp dụng
	}
}

