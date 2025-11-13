# Quick Block Mod 🚀

Một mod Fabric cho Minecraft 1.21.10 giúp tăng hiệu suất và tốc độ chơi game!

## ✨ Tính năng

### 1. **Đặt Block Nhanh Hơn** ⚡
- Giảm độ trễ giữa các lần đặt block
- Cho phép bạn xây dựng nhanh hơn
- **Không ảnh hưởng** đến tốc độ tấn công hay đào

### 2. **Nén Vật Thể Nhanh** 📦
- Các vật thể tự động hợp nhất nhanh hơn
- Giảm lag khi có nhiều item trên mặt đất
- Đặc biệt hiệu quả với:
  - 💧 Thuốc (Potion)
  - ✨ Trai kinh nghiệm (Experience Bottle)
  - 🧪 Chai thủy tinh (Glass Bottle)

### 3. **Giảm Lag** 🎮
- Tối ưu hóa hiệu suất chung
- Giảm CPU/GPU usage
- Game chạy mượt hơn

## ⚙️ Cấu Hình

Mở file `src/main/java/com/example/config/QuickBlockConfig.java` để điều chỉnh:

```java
// Tăng tốc độ đặt block
ENABLE_FAST_BLOCK_PLACEMENT = true;
BLOCK_PLACE_DELAY = 2; // Giảm từ 5 xuống 2 ticks

// Nén vật thể nhanh
ENABLE_ITEM_MERGE = true;
ITEM_MERGE_DELAY = 8; // Giảm từ 40 xuống 8 ticks

// Tối ưu hóa
ENABLE_OPTIMIZATION = true;
```

## 🚫 **CÓ CHỈ ĐỊNH: Các tính năng KHÔNG bị áp dụng**

Mod này **KHÔNG** tăng tốc độ:
- ❌ **Đào nhanh** (Mining Speed)
- ❌ **Tấn công nhanh** (Attack Speed)
- ❌ **Bắn cung nhanh** (Bow Speed)
- ❌ **Tương tác với NPC** (NPC Interaction Speed)

## 📋 Yêu Cầu

- Minecraft 1.21.10
- Fabric Loader 0.17.3+
- Fabric API 0.136.0+
- Java 21+

## 🔧 Cải Thiện Hiệu Năng

Mod này tập trung vào:
1. **Server-side optimization** - Xử lý tối ưu item entity
2. **Client-side optimization** - Giảm độ trễ giao diện
3. **Network optimization** - Giảm gửi packet không cần thiết

## 📝 Ghi Chú

- Mod này hoạt động trên **cả single-player và multiplayer**
- Có thể sử dụng trên **server và client**
- **Không phá vỡ tính cân bằng** của game
- **Không gây lỗi** khi sử dụng với các mod khác (hầu hết)

## 🛠️ Biên Dịch

```bash
./gradlew build
```

JAR file sẽ được tạo tại: `build/libs/quickblock-1.0.0.jar`

## 📦 Cài Đặt

1. Tải xuống mod JAR file
2. Đặt vào thư mục `mods` của Minecraft
3. Khởi động Minecraft với Fabric Loader
4. Chơi game và tận hưởng tốc độ! 🎉

## 📞 Hỗ Trợ

Nếu gặp vấn đề:
1. Kiểm tra version Minecraft và Fabric Loader
2. Xóa cache và tải lại mod
3. Báo cáo lỗi với chi tiết đầu đủ

---

**Developed with ❤️ for Minecraft Players**
