 API 명세
 =
---
## 1. 일정(Schedule)API
### 1.



---
ERD (Entity Relationship Diagram)
=
1. Schedule

| 칼럼 이름 | 데이터타입 | null허용 | key 종류 | 기본 값 | 설명 |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **id** | BIGINT(20) | NOT NULL | PK | AUTO_INCREMENT | 일정 ID |
| **name** | VARCHAR(20) | NOT NULL | | | 회원 이름 |
| **title** | VARCHAR(30) | NOT NULL | | | 일정 제목 |
| **content** | VARCHAR(100) | NULL | | | 일정 내용 |
| **createDate** | DATETIME | NOT NULL | | CURRENT_TIMESTAMP | 생성일 |
| **modifiedDate** | DATETIME | NOT NULL | | ON UPDATE CURRENT_TIMESTAMP | 수정일 |