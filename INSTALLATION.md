# Hướng Dẫn Cài Đặt Quick Block Mod 🎮

## 📋 Yêu Cầu

- **Minecraft 1.21.10** (phiên bản chính xác này)
- **Fabric Loader 0.17.3+**
- **Fabric API 0.136.0+**
- **Java 21+**

## 📥 Cài Đặt

### Bước 1: Tải Fabric Loader
1. Truy cập https://fabricmc.net/use/installer/
2. Tải xuống **Fabric Installer**
3. Chạy installer, chọn phiên bản Minecraft **1.21.10**
4. Chọn "Installer" mode
5. Kích hoạt nút "Install" 

### Bước 2: Cài Đặt Fabric API
1. Tải [Fabric API](https://modrinth.com/mod/fabric-api) phiên bản **0.136.0+1.21.10**
2. Mở thư mục `.minecraft/mods/` của bạn
3. Sao chép file `fabric-api-0.136.0+1.21.10.jar` vào đó

### Bước 3: Cài Đặt Quick Block Mod
1. Tải mod từ `build/libs/quickblock-1.0.0.jar`
2. Sao chép vào thư mục `.minecraft/mods/`
3. Khởi động Minecraft với **Fabric profile**

## ✅ Kiểm Tra Cài Đặt

1. Khởi động Minecraft
2. Chọn profile **Fabric** 
3. Mở Mods list (`Esc → Mods`)
4. Tìm **Quick Block** trong danh sách
5. Xác nhận nó bật ✓

## 📝 Sử Dụng Mod

Sau khi cài đặt:
- 🚀 Đặt block sẽ **nhanh hơn** tự động
- 📦 Các item (thuốc, trai kinh nghiệm) sẽ **hợp nhất nhanh hơn**
- 🎮 Game chạy với **lag ít hơn**

**Không cần cấu hình thêm** - mod hoạt động ngay lập tức!

## 🔧 Tùy Chỉnh (Advanced)

Nếu muốn điều chỉnh các tính năng:

1. Mở file `QuickBlockConfig.java`
2. Sửa các hằng số:

```java
// Tăng tốc độ đặt block (giảm delay)
public static final int BLOCK_PLACE_DELAY = 2; // 0-5

// Nén vật thể nhanh (giảm delay)
public static final int ITEM_MERGE_DELAY = 8; // 0-40

// Bật/tắt tính năng
public static final boolean ENABLE_FAST_BLOCK_PLACEMENT = true;
public static final boolean ENABLE_ITEM_MERGE = true;
public static final boolean ENABLE_OPTIMIZATION = true;
```

3. Biên dịch lại: `./gradlew build`
4. Thay thế file mod trong thư mục `mods/`

## ⚠️ Vấn Đề Thường Gặp

### Lỗi: "Mod không tìm thấy"
- Kiểm tra file mod có nằm trong `.minecraft/mods/` không
- Kiểm tra phiên bản Minecraft (phải là 1.21.10)
- Kiểm tra Fabric Loader đã cài đúng chưa

### Game bị lag
- Hãy tắt mod: xóa `quickblock-1.0.0.jar` từ mods
- Kiểm tra các mod khác có xung đột không
- Tăng RAM cho Minecraft (ít nhất 2GB)

### Mod không hoạt động
- Kiểm tra Fabric API đã cài chưa
- Xóa thư mục `.minecraft/versions` và tải lại
- Cài đặt lại Fabric Loader

## 📞 Hỗ Trợ

Nếu vẫn gặp vấn đề:
1. Kiểm tra [Fabric Documentation](https://fabricmc.net/wiki/)
2. Xem [Minecraft Launcher Log](https://help.minecraft.net/hc/en-us/articles/360035131051-Where-are-Minecraft-files-located-)

## 🎉 Chúc Mừng!

Bạn đã cài đặt thành công Quick Block Mod!

Hãy tận hưởng:
- ⚡ Xây dựng nhanh hơn
- 📦 Nhặt vật thể mượt mà hơn
- 🎮 Game chơi mượt mà hơn

**Happy Building!** 🏗️
