Bài 1 (Dễ):

Viết chương trình:

Tạo ArrayList<Integer>

Thêm các số: 5, 1, 9, 1, 3

In ra danh sách

In ra phần tử ở index 2

Xóa phần tử ở index 1

In lại danh sách sau khi xóa

Bài 2 (Trung bình):

Cho danh sách tên sinh viên: ["Lan", "Hoa", "Lan", "Minh", "Kien"]

Yêu cầu:

Lưu vào ArrayList<String>

Đếm xem mỗi tên xuất hiện bao nhiêu lần
(gợi ý: duyệt list và dùng biến đếm)

Output mong muốn:

Lan: 2
Hoa: 1
Minh: 1
Kien: 1

Bài 3 (Nâng cao — LinkedList):

Viết chương trình quản lý hàng đợi (queue):

Dùng LinkedList<String>

Thêm người A, B, C vào queue

Người ở đầu hàng được phục vụ trước → remove()

Sau đó thêm người D, E

In danh sách còn lại trong hàng

✅ PHẦN 2 — SET (HashSet, LinkedHashSet, TreeSet)
Bài 4 (Cơ bản — HashSet):

Nhập 6 số nguyên từ bàn phím.
Lưu vào HashSet<Integer>.

Yêu cầu:

In ra các số người dùng đã nhập

(Lưu ý: số trùng sẽ tự biến mất)

Bài 5 (Trung bình — LinkedHashSet):

Cho list sau:
"A", "B", "C", "A", "D", "B", "E"

Yêu cầu:

Lưu vào LinkedHashSet

In ra thứ tự phần tử theo thứ tự xuất hiện ban đầu

Kết quả mong muốn:

A B C D E

Bài 6 (Nâng cao — TreeSet):

Nhập 7 số nguyên bất kỳ từ bàn phím.
Lưu vào TreeSet<Integer>.

Yêu cầu:

In ra theo thứ tự tăng dần

In ra số nhỏ nhất

In ra số lớn nhất

✅ PHẦN 3 — MAP (HashMap, LinkedHashMap, TreeMap)
Bài 7 (Cơ bản — HashMap):

Tạo danh sách sinh viên + điểm:

"Lan" → 9
"Hoa" → 7
"Minh" → 8


Yêu cầu:

Lưu vào HashMap

In ra tất cả key

In ra tất cả value

In ra từng cặp key → value

Bài 8 (Trung bình — Tần suất ký tự):

Nhập một chuỗi từ bàn phím, ví dụ:

hello world


Dùng HashMap<Character, Integer> để:

Đếm số lần xuất hiện của từng ký tự

In ra kết quả theo dạng:

h: 1
e: 1
l: 3
o: 2
...

Bài 9 (Nâng cao — TreeMap):

Cho danh sách sản phẩm + giá:

Coca → 10
Pepsi → 9
Sting → 11
7Up → 8


Yêu cầu:

Lưu vào TreeMap<String, Integer>

In ra theo thứ tự alphabet của tên sản phẩm

Tính tổng tiền của tất cả sản phẩm

Tìm sản phẩm có giá cao nhất

🔥 PHẦN COMBO (Tổng hợp tất cả Collections)
Bài 10 (Rất hay — Nên làm):

Viết chương trình quản lý lớp học:

Lưu danh sách tên sinh viên (List)

Không cho phép trùng tên (convert sang Set)

Gán mỗi sinh viên 1 mã số tự tăng (Map<StudentName, ID>)

In ra danh sách map theo thứ tự alphabet của tên sinh viên