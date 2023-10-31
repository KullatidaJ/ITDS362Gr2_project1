# ITCS473 Project Assignment 1
## Unit Test for Open-Source Software Projects
### Group 2 
 
#### 6487015 Jarasporn Konta
#### 6487025 yanathip jaroenjan
#### 6487040 Naruebet Phonsin
#### 6487072 Kamolluck Udompaiboonlarp
#### 6487073 Kullatida Jangsawat
#### 6487074 Kullanipa Jangsawat


# testOkLogin()

- ชื่อของ Test case - testOkLogin()

- จุดประสงค์ - ตรวจสอบว่า method testOkLogin ของ class LoginPresenter สามารถ Login ได้ถูกต้อง

- Characteristics

**Interface-based characteristic**

  1. Identify testable functions - testOkLogin
  2. Identify parameters, return types, return values, and exceptional behavior
     - Parameters: Email Address(email), Password (pass)
     - Return type: String
     - Return value: Success or Error
     - Exceptional behavior: email ไม่ถูกต้องหรือมีข้อผิดพลาดในการเชื่อมต่อกับเซิร์ฟเวอร์

  3. Model the input domain

    - Partition characteristics

   | Characteristic          | b1      | b2    | 
   | :---------------------- | :------ | :---- | 
   | C1 = Login Success      |  True   | True  |  
   | C2 = Login Unsuccess    |  True   | False | 

    - Identify (possible) values

   | Characteristic          | b1                | b2       |
   | :---------------------- | :---------------- | :--------|
   | C1 = Login Success      | user@example.com  | P@ssw0rd | 
   | C2 = Login Unsuccess    | user@example.com  | " "      | 


**Functionality-based Characteristics**

  1. Identify testable functions - testOkLogin
  2. Identify parameters, return types, return values, and exceptional behavior
     - Parameters: Email Address(email), Password (pass)
     - Return type: String
     - Return value: Success or Error
     - Exceptional behavior: email ไม่ถูกต้องหรือมีข้อผิดพลาดในการเชื่อมต่อกับเซิร์ฟเวอร์

  3. Model the input domain

    - Partition characteristics

  | Characteristic                            | b1     | b2    |
  | :---------------------------------------- | :----- | :---- |
  | C1 = Valid email and password             |  True  | True  | 
  | C2 = Valid email and empty password       |  True  | False | 
  | C3 = Valid email and invalid password     |  True  | False | 
  | C4 = Empty email and valid password       |  False | True  | 
  | C5 = Empty email and empty password       |  False | False | 
  | C6 = Invalid email and valid password     |  False | True  |  
  | C7 = Invalid email and empty password     |  False | False |  
  | C8 = Invalid email and invalid password   |  False | False |
  


       - Identify (possible) values

   | Characteristic                            | b1                   | b2                      |
   | :---------------------------------------- | :------------------- | :---------------------- |
   | C1 = Valid email and password             |  user@example.com    | P@ssw0rd                | 
   | C2 = Valid email and empty password       |  user@example.com    |                         | 
   | C3 = Valid email and invalid password     |  user@example.com    | invalidpassword         | 
   | C4 = Empty email and valid password       |                      | P@ssw0rd                | 
   | C5 = Empty email and empty password       |                      |                         |  
   | C6 = Invalid email and valid password     |  invalidemail        | P@ssw0rd                | 
   | C7 = Invalid email and empty password     |  invalidemail        |                         |  
   | C8 = Invalid email and invalid password   |  invalidemail        | invalidpassword         | 



  4. Combine partitions to define test requirements

    - All Combinations Tests (BCC) 

      C1 x C1 (Valid email and password x Valid email and password)
      C1 x C2 (Valid email and password x Valid email and empty password)
      C1 x C3 (Valid email and password x Valid email and invalid password)
      C2 x C4 (Valid email and empty password x Empty email and valid password)
      C2 x C5 (Valid email and empty password x Empty email and empty password)
      C3 x C6 (Valid email and invalid password x Invalid email and valid password)
      C3 x C7 (Valid email and invalid password x Invalid email and empty password)
      C3 x C8 (Valid email and invalid password x Invalid email and invalid password)
      
      = 8 test



  5. Derive test values

   | Test                                      | Email Address        | Password                | Expected result |
   | :---------------------------------------- | :--------------------| :-----------------------| :-------------- |
   | T1 = Valid email and password             |  user@example.com    | P@ssw0rd                | Success         |
   | T2 = Valid email and empty password       |  user@example.com    |                         | Error           |
   | T3 = Valid email and invalid password     |  user@example.com    | invalidpassword         | Error           |
   | T4 = Empty email and valid password       |                      | P@ssw0rd                | Error           |
   | T5 = Empty email and empty password       |                      |                         | Error           |
   | T6 = Invalid email and valid password     |  invalidemail        | P@ssw0rd                | Error           |
   | T7 = Invalid email and empty password     |  invalidemail        |                         | Error           |
   | T8 = Invalid email and invalid password   |  invalidemail        | invalidpassword         | Error           |


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


# testSortRestaurants()

- ชื่อของ Test case - testSortRestaurants()

- จุดประสงค์ - ตรวจสอบว่า method testSortRestaurants ของ class RestaurantsActivity ทำงานถูกต้องหรือไม่

- Characteristics

**Interface-based characteristic**

  1. Identify testable functions - testSortRestaurants
  2. Identify parameters, return types, return values, and exceptional behavior
     - Parameters: sortType (int)
     - Return type: boolean
     - Return value: true or false
     - Exceptional behavior: อาจเกิดข้อผิดพลาดหาก sortType ไม่ถูกต้อง

  3. Model the input domain

    - Partition characteristics

| Characteristic                     | b1      | b2    | 
| :----------------------------------| :------ | :---- | 
| C1 = Sorting by valid sortType     |  True   | False |  
| C2 = Sorting by invalid sortType   |  False  | True  | 

      - Identify (possible) values

  | Characteristic                     | b1                         | b2       |
  | :----------------------------------| :------------------------- | :--------|
  | C1 = Sorting by valid sortType     | R.id.restaurantSortRating  | " "      | 
  | C2 = Sorting by invalid sortType   | " "                        | " "      | 


**Functionality-based Characteristics**

  1. Identify testable functions - testSortRestaurants
  2. Identify parameters, return types, return values, and exceptional behavior
     - Parameters: sortType (int)
     - Return type: boolean
     - Return value: true or false
     - Exceptional behavior: อาจเกิดข้อผิดพลาดหาก sortType ไม่ถูกต้อง

  3. Model the input domain

    - Partition characteristics

  | Characteristic                            | b1     | b2    |
  | :---------------------------------------- | :----- | :---- |
  | C1 = R.id.restaurantSortPricesLow         |  True  | False | 
  | C2 = R.id.restaurantSortPricesHigh        |  True  | False | 
  | C3 = R.id.restaurantSortRating            |  True  | False | 
  | C4 = R.id.restaurantSortVotes             |  True  | False | 
  | C5 = R.id.restaurantSortAlphabet          |  True  | False |
  | C6 = invalid sortType                     |  False | False | 

  
       - Identify (possible) values

   | Characteristic                            | b1     | b2    |
   | :---------------------------------------- | :----- | :---- |
   | C1 = R.id.restaurantSortPricesLow         |  True  | False | 
   | C2 = R.id.restaurantSortPricesHigh        |  True  | False | 
   | C3 = R.id.restaurantSortRating            |  True  | False | 
   | C4 = R.id.restaurantSortVotes             |  True  | False | 
   | C5 = R.id.restaurantSortAlphabet          |  True  | False | 
   | C6 = invalid sortType                     |  False | False | 



4. Combine partitions to define test requirements

       - All Combinations Tests (BCC) 

       (True, True), (False, False)
      
       = 2 test



5. Derive test values

    | Test                                      | sortType                | Expected result |
    | :---------------------------------------- | :-----------------------| :-------------- |
    | T1 = R.id.restaurantSortPricesLow         | b1 ของ C1               | True            |
    | T2 = R.id.restaurantSortPricesHigh        | b2 ของ C1               | True            |
    | T3 = R.id.restaurantSortRating            | b1 ของ C1               | True            |
    | T4 = R.id.restaurantSortVotes             | b1 ของ C1               | True            |
    | T5 = R.id.restaurantSortAlphabet          | b1 ของ C1               | True            |
    | T6 = invalid sortType                     | -1                      | False           |




-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


## testonOptionsItemSelected() 

1. ชื่อของ Test case -  testonOptionsItemSelected()
2. จุดประสงค์ - เพื่อตรวจสอบว่าผู้ใช้งานคลิกที่ปุ่ม Home หรือไม่
- Identify testable functions - onOptionsItemSelected()
- Identify parameters, return types, return values, and exceptional behavior
  - Parameters: MenuItem item
  - Return type: ฺBoolean
  - Return value: Return True when switch correct condition and go to markAllAsRead() method or go to other item when user did not click on home button 
  - Exceptional behavior: None

3. Model the input domain

 **interface-based characteristic**

        - Partition characteristics
   | Characteristic | b1   | b2   | b3   |
   | -------------- | ---- | ---- | ---- |
   | C1 = คลิกปุ่ม Home | True | False | False |



        * Identify (possible) values
   | Characteristic               | b1                | b2                    | b3                       |
   | ---------------------------- | ----------------- | --------------------- | ------------------------ |
   | C1 = คลิกปุ่ม Home          | App ปิดลง       | ไปยัง markAllAsRead() | return super.onOptionsItemSelected(item) |


 **Functionality-based Characteristics**

        - Partition characteristics
|Characteristic | b1 | b2 | b3 |
|----- | ----- | ----- | ----- |
|C1 = คลิกปุ่ม Home | True| False | False |
|C1 = คลิกรายการเมนู | True | False | 
|C1 = คลิกปุ่มอื่น | True | False | 

        * Identify (possible) values

   |Characteristic | b1 | b2 | b3 |
   |----- | ----- | ----- | ----- |
   |C1 = คลิกปุ่ม Home | True| False | False |
   |C1 = คลิกรายการเมนู | True | False |  
   |C1 = คลิกปุ่มอื่น | True | False | 

4. การรวม partition  โดยใช้วิธีการ PWC

  * Test Requirment = numbers of tests = 3*2= 6

      * C1,C2 -> (App ปิด, ไปยัง markAllAsRead() method) (App ปิด, ไปยัง method อื่น) 
                 (App ยังคงเปิด, ไปยัง markAllAsRead() method) (App ยังคงเปิด, ไปยัง method อื่น) 
                 (ไปยัง method อื่น, ไปยัง markAllAsRead() method) (ไปยัง method อื่น, ไปยัง method อื่น) 
      * C2,C3 -> (ไปยัง markAllAsRead() method,return super.onOptionsItemSelected(item)) 
                 (ไปยัง markAllAsRead() method,ไปยัง method อื่น)
                 (ไปยัง method อื่น,return super.onOptionsItemSelected(item)) 
                 (ไปยัง method อื่น,ไปยัง method อื่น)
      * C1,C3 -> (App ปิด, return super.onOptionsItemSelected(item)) (App ปิด, ไปยัง method อื่น) 
                 (App ยังคงเปิด, return super.onOptionsItemSelected(item)) (App ยังคงเปิด, ไปยัง method อื่น) 
                 (ไปยัง method อื่น, return super.onOptionsItemSelected(item)) (ไปยัง method อื่น, ไปยัง method อื่น) 
 
            This is almost certainly more than we need only  are 6 valid is 
            1. (App ปิด, ไปยัง markAllAsRead() method, return super.onOptionsItemSelected(item))
            2. (App ปิด, ไปยัง method อื่น, ไปยัง method อื่น)
            3. (App ยังคงเปิด, ไปยัง markAllAsRead() method , ไปยัง method อื่น)
            4. (App ยังคงเปิด, ไปยัง method อื่น , return super.onOptionsItemSelected(item))
            5. (ไปยัง method อื่น, ไปยัง markAllAsRead() method, return super.onOptionsItemSelected(item))
            6. (ไปยัง method อื่น, ไปยัง method อื่น, ไปยัง method อื่น)
            
5. Derive test values

   | Test | B1 | B2 | B3 |   Expected result |
   |------| ----- | ----- | ----- | ----- | 
   | T1   | App ปิด | ไปยัง markAllAsRead() method | return super.onOptionsItemSelected(item)| Fail|
   | T2   | App ปิด | ไปยัง method อื่น | ไปยัง method อื่น | Fail|
   | T3   | App ยังคงเปิด | ไปยัง markAllAsRead() method | ไปยัง method อื่น| Paas|
   | T4   | App ยังคงเปิด | ไปยัง method อื่น | return super.onOptionsItemSelected(item) | Pass|
   | T5   | ไปยัง method อื่น | ไปยัง markAllAsRead() method | return super.onOptionsItemSelected(item) | Pass|
   | T6   | ไปยัง method อื่น | ไปยัง method อื่น | ไปยัง method อื่น| Pass|





-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


## testonDateSet() 

1. ชื่อของ Test case -  testonDateSet()
2. จุดประสงค์ - เพื่อตรวจสอบว่าผู้ใช้งานเลือกวันที่ใหม่เป็นอย่างไรเมื่อเทียบกับวันที่เดิม
3. Model the input domain
- Identify testable functions - onDateSet()
- Identify parameters, return types, return values, and exceptional behavior
  - Parameters: DatePicker view, int year, int month, int dayOfMonth
  - Return type: None(void)
  - Return value: Write new Date on Log that user choose but if new date is less than current Date, Snackbar is shown.
  - Exceptional behavior: None

**interface-based characteristic**
* Model the input domain

  |  Characteristic               | b1 | b2 |
  |-------------------------------| ----- | ----- | 
  | C1 = New Date > Current Date  | True | False | 
  | C2 = New Date == Current Date | True | False | 
  | C3 = New Date < Current Date  | True | False | 

* Identify (possible) values

  | Characteristic                | b1 | b2 |
  |-------------------------------| ----- | ----- | 
  | C1 = New Date > Current Date  | Valid date selected | Invalid date selected | 
  | C2 = New Date == Current Date | Invalid date selected | Valid date selected  | 
  | C3 = New Date < Current Date  | Invalid date selected | Valid date selected  | 

**Functionality-based Characteristics**
* Model the input domain

  | Characteristic       | b1         | b2         | b3         |
  |:---------------------|:-----------|:-----------|:-----------|
  | C1 = วันที่ใหม่กว่า  | True       | False      | 
  | C2 = วันที่เดิม      | วันที่ใหม่ | วันที่เดิม | วันที่เก่า |
  | C3 = วันที่เก่ากว่า  | True       | False      | 

* Identify (possible) values

  | Characteristic         | b1                    | b2                    | b3         |
  |:-----------------------|:----------------------|:----------------------|:-----------|
  | C1 = วันที่ใหม่กว่า    |  Valid date selected  | Invalid date selected | 
  | C2 = วันที่เดิม        | 17/05/2566            | 16/05/2566            | 15/05/2566 |
  | C3 = วันที่เก่ากว่า    | Invalid date selected | Valid date selected   | 

4. การรวม partition  โดยใช้วิธีการ PWC

  * Test Requirement = numbers of tests = 3*2= 6

      * C1,C2 -> (Valid date selected, 17/05/2566 ) (Valid date selected, 16/05/2566 ) (Valid date selected, 15/05/2566 )
                 (Invalid date selected, 17/05/2566 ) (Invalid date selected, 16/05/2566 ) (Invalid date selected, 15/05/2566 )
      * C2,C3 -> (17/05/2566, Invalid date selected) (17/05/2566, Valid date selected) 
                 (16/05/2566, Invalid date selected) (16/05/2566, Valid date selected) 
                 (15/05/2566, Invalid date selected) (15/05/2566, Valid date selected) 
      * C1,C3 -> (Valid date selected, Invalid date selected) (Invalid date selected, Valid date selected) 
                 (Invalid date selected, Invalid date selected) (Invalid date selected, Valid date selected) 
            This is almost certainly more than we need only  are 6 valid is 
            1. (Valid date selected, 17/05/2566, Invalid date selected)
            2. (Valid date selected, 16/05/2566, Valid date selected)
            3. (Valid date selected, 15/05/2566, Valid date selected)
            4. (Invalid date selected, 17/05/2566, Valid date selected)
            5. (Invalid date selected, 16/05/2566, Invalid date selected)
            6. (Invalid date selected, 15/05/2566, Invalid date selected)
            
5. Derive test values

    | Test  | B1                    | B2         | B3                    | Expected result | 
    |:------|:----------------------|:-----------|:----------------------|:----------------| 
    | T1    | Valid date selected   | 17/05/2566 | Invlid date selected  | Fail            |
    | T2    | Valid date selected   | 16/05/2566 | Valid date selected   | Fail            |
    | T3    | Valid date selected   | 15/05/2566 | Valid date selected   | Fail            |
    | T4    | Invalid date selected | 17/05/2566 | Valid date selected   | Fail            |
    | T5    | Invalid date selected  | 16/05/2566 | Invalid date selected | Pass            |
    | T6    | Invalid date selected  | 15/05/2566 | Invalid date selected | Pass            |




-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


# testValidPassword() 

- ชื่อของ Test case - testValidPassword 

- จุดประสงค์ - ตรวจสอบว่า method validatePassword ของ class SettingsFragment ตรวจสอบรหัสผ่านที่ตรงตามเงื่อนไขอย่างถูกต้อง

- Characteristics

**Interface-based characteristic**

  1. Identify testable functions - validatePassword
  2. Identify parameters, return types, return values, and exceptional behavior
    - Parameters: String passString
    - Return type: boolean
    - Return value: True ถ้าตั้งรหัสผ่านตามเงื่อนไข, False ถ้าตั้งรหัสผ่านไม่ตรงตามเงื่อนไข
    - Exceptional behavior: รหัสผ่านมีความยาวน้อยกว่า 8

  3. Model the input domain

    - Partition characteristics

  | Characteristic          | b1      | b2    |
  | :---------------------- | :------ | :---- |
  | C1 = Valid Password     |  True   | False | 
  | C2 = Invalid Password   |  False  | True  | 


    - Identify (possible) values

  | Characteristic           | b1             | b2        |
  | :----------------------- | :------------- | :-------- |
  | C1 = Valid Password      |  Papaya!sala4  | wEakp@ss  | 
  | C2 = Invalid Password    |  Grapejuice!1  | Nogo pass | 


**Functionality-based Characteristics**

  1. Identify testable functions - validatePassword
  2. Identify parameters, return types, return values, and exceptional behavior
    - Parameters: String passString
    - Return type: boolean
    - Return value: True ถ้าตั้งรหัสผ่านตามเงื่อนไข, False ถ้าตั้งรหัสผ่านไม่ตรงตามเงื่อนไข
    - Exceptional behavior: รหัสผ่านมีความยาวน้อยกว่า 8

  3. Model the input domain

    - Partition characteristics

  | Characteristic                            | b1     | b2    |
  | :---------------------------------------- | :----- | :---- |
  | C1 = Password length >= 8                 |  True  | False | 
  | C2 = Password contains digit              |  True  | False | 
  | C3 = Password contains uppercase letter   |  True  | False | 
  | C4 = Password contains special character  |  True  | False | 
  | C5 = Password contain whitespace          |  False | True  | 

    - Identify (possible) values

  | Characteristic                            | b1           | b2         |
  | :---------------------------------------- | :----------- | :--------- |
  | C1 = Password length >= 8                 |  cAt#dog007  | Kkgg       | 
  | C2 = Password contains digit              |  Apple@p1e   | hok@Lop    | 
  | C3 = Password contains uppercase letter   |  Mango!bb8   | bananab0a! | 
  | C4 = Password contains special character  |  CoCon9t!ss  | sunDayser  | 
  | C5 = Password contain whitespace          |  mElonP1E?   | cake cake  | 


  4. Combine partitions to define test requirements

    - All Combinations Tests (ACoC) 

  | Characteristic                            | b1      | b2     | 
  | :---------------------------------------- | :------ | :----- |
  | C1 = Valid Password                       |  True   | False  |
  | C2 = Invalid Password                     |  False  | True   | 
  | C3 = Password length >= 8                 |  True   | True   | 
  | C4 = Password contains digit              |  True   | False  | 
  | C5 = Password contains uppercase letter   |  True   | False  | 
  | C6 = Password contains special character  |  True   | False  | 
  | C7 = Password contain whitespace          |  False  | True   | 

     (True,False), (True,True), (True,True), (True,True), (True,True), (True,False), (True,True), (True,False), (True,True), (True,False), (True,False), (True,True), (False,False), (False,True), (False,True), (False,True), (False,True), (False,False), (False,True), (False,False), (False,True), (False,False), (False,False), (False,True), (False,True), (False,True), (False,True), (False,False), (False,True), (False,False), (False,True), (False,False), (False,False), (False,True), (True,True), (True,True), (True,True), (True,False), (True,True), (True,False), (True,True), (True,False), (True,False), (True,False), (True,False), (True,True), (True,False), (True,True), (True,False), (True,True), (True,False), (True,True), (True,False), (True,True), (True,False), (True,True), (True,False), (True,True), (True,False), (True,True), (True,True), (True,False), (True,True), (True,False), (True,False), (True,True), (False,True), (False,False), (False,True), (False,False), (False,False), (False,True), (True,True), (True,False), (True,False), (True,True), (False,True), (False,False), (False,False), (False,True), (True,False), (True,True), (False,False), (False,True) = 2^7 = 128 test

     เนื่องจากมีแค่ 1 parameter เป็น boolean = (True), (False) = 2 test


  5. Derive test values

  | Test                     | passString   | Expected result  |
  |:-------------------------|:-------------|:-----------------|
  | T1 (Valid Password)      | Pp@ssword1   | True             |
  | T2 (Invalid Password)    | P@ss wo3d    | False            |




-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


# testGetTimeAgo() 

- ชื่อของ Test case - testGetTimeAgo 

- จุดประสงค์ - ตรวจสอบว่า method getTimeAgo ของ class NotificationsActivity เช็คความต่างของเวลาถูกต้องหรือไม่

- Characteristics

**Interface-based characteristic**

  1. Identify testable functions - getTimeAgo
  2. Identify parameters, return types, return values, and exceptional behavior
    - Parameters: long time
    - Return type: String
    - Return value: ความแตกต่างของเวลาที่ input เข้ามากับเวลาปัจจุบัน
    - Exceptional behavior: ใส่เวลาในอนาคต

  3. Model the input domain

    - Partition characteristics

  | Characteristic          | b1      | b2    |
  | :---------------------- | :------ | :---- |
  | C1 = time in the past   |  True   | False | 
  | C2 = time in the future |  False  | True  | 

    - Identify (possible) values

  | Characteristic          | b1                | b2               |
  | :---------------------- | :---------------- | :--------------- |
  | C1 = time in the past   |  Any past times   | Any future times | 
  | C2 = time in the future |  Any past times   | Any future times | 


**Functionality-based Characteristics**

  1. Identify testable functions - getTimeAgo
  2. Identify parameters, return types, return values, and exceptional behavior
    - Parameters: long time
    - Return type: String
    - Return value: ความแตกต่างของเวลาที่ input เข้ามากับเวลาปัจจุบัน
    - Exceptional behavior: ใส่เวลาในอนาคต

  3. Model the input domain

    - Partition characteristics

  | Characteristic                            | b1     | b2    |
  | :---------------------------------------- | :----- | :---- |
  | C1 = Elapsed Time Less Than a Minute      |  True  | False | 
  | C2 = Elapsed Time of One Minute           |  True  | False | 
  | C3 = Elapsed Time Less Than an Hour       |  True  | False | 
  | C4 = Elapsed Time of One Hour             |  True  | False | 
  | C5 = Elapsed Time Less Than a Day         |  True  | False | 
  | C6 = Elapsed Time of One Day              |  True  | False | 
  | C7 = Elapsed Time Less Than a Month       |  True  | False | 
  | C8 = Elapsed Time of One Month            |  True  | False | 
  | C9 = Elapsed Time Less Than a Year        |  True  | False | 
  | C10 = Elapsed Time of One Year            |  True  | False | 
  | C11 = Elapsed Time Greater Than One Year  |  True  | False | 
  | C12 = Invalid Timestamp Values            |  True  | False | 


    - Identify (possible) values

  | Characteristic                            | b1                        | b2                      |
  | :---------------------------------------- | :------------------------ | :---------------------- |
  | C1 = Elapsed Time Less Than a Minute      |  time = now - 30 seconds  | time = now + 30 seconds | 
  | C2 = Elapsed Time of One Minute           |  time = now - 1 minute    | time = now + 1 minute   | 
  | C3 = Elapsed Time Less Than an Hour       |  time = now - 30 minutes  | time = now + 30 minutes | 
  | C4 = Elapsed Time of One Hour             |  time = now - 1 hour      | time = now + 1 hour     | 
  | C5 = Elapsed Time Less Than a Day         |  time = now - 12 hours    | time = now + 12 hours   | 
  | C6 = Elapsed Time of One Day              |  time = now - 1 day       | time = now + 1 day      | 
  | C7 = Elapsed Time Less Than a Month       |  time = now - 15 days     | time = now + 15 days    | 
  | C8 = Elapsed Time of One Month            |  time = now - 1 month     | time = now + 1 month    | 
  | C9 = Elapsed Time Less Than a Year        |  time = now - 6 months    | time = now + 6 months   | 
  | C10 = Elapsed Time of One Year            |  time = now - 1 year      | time = now + 1 year     | 
  | C11 = Elapsed Time Greater Than One Year  |  time = now - 2 years     | time = now + 2 years    | 


  4. Combine partitions to define test requirements

    - All Combinations Tests (ACoC) 

  | Characteristic                            | b1                        | b2                      |
  | :---------------------------------------- | :------------------------ | :---------------------- |
  | C1 = time in the past                     |  Any past times           | Any future times        | 
  | C2 = time in the future                   |  Any past times           | Any future times        | 
  | C3 = Elapsed Time Less Than a Minute      |  time = now - 30 seconds  | time = now + 30 seconds | 
  | C4 = Elapsed Time of One Minute           |  time = now - 1 minute    | time = now + 1 minute   | 
  | C5 = Elapsed Time Less Than an Hour       |  time = now - 30 minutes  | time = now + 30 minutes | 
  | C6 = Elapsed Time of One Hour             |  time = now - 1 hour      | time = now + 1 hour     | 
  | C7 = Elapsed Time Less Than a Day         |  time = now - 12 hours    | time = now + 12 hours   | 
  | C8 = Elapsed Time of One Day              |  time = now - 1 day       | time = now + 1 day      | 
  | C9 = Elapsed Time Less Than a Month       |  time = now - 15 days     | time = now + 15 days    | 
  | C10 = Elapsed Time of One Month           |  time = now - 1 month     | time = now + 1 month    | 
  | C11 = Elapsed Time Less Than a Year       |  time = now - 6 months    | time = now + 6 months   | 
  | C12 = Elapsed Time of One Year            |  time = now - 1 year      | time = now + 1 year     | 
  | C13 = Elapsed Time Greater Than One Year  |  time = now - 2 years     | time = now + 2 years    | 
      
      = 13 test



  5. Derive test values

  | Test                                      | time                      | Expected result    |
  | :---------------------------------------- | :------------------------ | :----------------- |
  | T1 (Elapsed Time Less Than a Minute)      |  time = now - 30 seconds  | Just now           | 
  | T2 (Elapsed Time of One Minute)           |  time = now - 1 minute    | a minute ago       | 
  | T3 (Elapsed Time Less Than an Hour)       |  time = now - 30 minutes  | 30 minutes ago     | 
  | T4 (Elapsed Time of One Hour)             |  time = now - 1 hour      | an hour ago        | 
  | T5 (Elapsed Time Less Than a Day)         |  time = now - 12 hours    | 12 hours ago       | 
  | T6 (Elapsed Time of One Day)              |  time = now - 1 day       | yesterday          | 
  | T7 (Elapsed Time Less Than a Month)       |  time = now - 15 days     | 15 days ago        | 
  | T8 (Elapsed Time of One Month)            |  time = now - 1 month     | 1 month ago        | 
  | T9 (Elapsed Time Less Than a Year)        |  time = now - 6 months    | 6 months ago       | 
  | T10 (Elapsed Time of One Year)            |  time = now - 1 year      | 1 year ago         | 
  | T11 (Elapsed Time Greater Than One Year)  |  time = now - 2 years     | 2 years ago        | 



-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


# testCityHistoryListItemCreation()

- ชื่อของ Test case - testCityHistoryListItemCreation

- จุดประสงค์ - ตรวจสอบว่าคลาส CityHistoryListItem สามารถสร้างอ็อบเจกต์ได้ถูกต้องและตรวจสอบค่าที่รับเข้ามาในคอนสตรักเตอร์ว่าถูกต้องหรือไม่
- Characteristics

**Interface-based characteristic**

  1. Identify testable functions - testCityHistoryListItemCreation()
  2. Identify parameters, return types, return values, and exceptional behavior
     - Parameters: String mHeading, String mText, Boolean mTrimText
     - Return type: String
     - Return value: Pass หรือ failed
     - Exceptional behavior: test pass

  3. Model the input domain

    - Partition characteristics

| Characteristic           | b1   | b2    |
|:-------------------------|:-----|:------|
| C1 = mHeading is correct | True | False | 
| C2 = mText is correct    | True | False | 
| C3 = mTrimText is True   | True | False | 


    - Identify (possible) values

| Characteristic           | b1        | b2                 |
|:-------------------------|:----------|:-------------------|
| C1 = mHeading is correct | "Heading" | "Bangkok"          | 
| C2 = mText is correct    | "Text"    | "A wonderful city" | 
| C3 = mTrimText is True   | True      | False              |


  4. การรวม partition  โดยใช้วิธีการ MBCC

         Base: ("Heading", "Text", True), ("Bangkok", "A wonderful city", False)

         Test: 2+(2*(2-1) + 2*(2-1) + 2*(2-1)) = 2+6 = 8

         ("Heading", "Text", True) -> ("Bangkok", "Text", True), ("Heading", "A wonderful city", True), ("Heading", "Text", False)

         ("Bangkok", "A wonderful city", False) -> ("Heading", "A wonderful city", False), ("Bangkok", "Text", False), ("Bangkok", "A wonderful city", True)

  5. Derive test values

| Characteristic     | b1                 | b2                 | Expected result     |
|:-------------------|:-------------------|:-------------------|:--------------------|
| T1 = (True,True)   | "Heading"          | "Heading"          | Pass                |
| T2 = (True,False)  | "Text"             | "A wonderful city" | Failed              |
| T3 = (True,True)   | True               | True               | Pass                |
| T1 = (False,False) | "Bangkok"          | "Heading"          | Failed              |
| T2 = (False,True)  | "A wonderful city" | "A wonderful city" | Failed              |
| T3 = (False,False) | False              | True               | Failed              |


**Functionality-based Characteristics**

  1. Identify testable functions - testCityHistoryListItemCreation()
  2. Identify parameters, return types, return values, and exceptional behavior
      - Parameters: String mHeading, String mText, Boolean mTrimText
      - Return type: String
      - Return value: Pass หรือ failed
      - Exceptional behavior: test pass

  3. Model the input domain

    - Partition characteristics

| Characteristic                                  | b1    | b2     |
|:------------------------------------------------|:------|:-------|
| C1 = All parameter matches the specified value  | True  | False  | 
| C2 = Some parameter matches the specified value | False | False  |


    - Identify (possible) values

| Characteristic                                        | b1                        | b2                                     |
|:------------------------------------------------------|:--------------------------|:---------------------------------------|
| C1 = All input parameter matches the specified value  | ("Heading", "Text", True) | ("Bangkok", "A wonderful city", False) | 
| C2 = Some input parameter matches the specified value | ("Bangkok", "Text", True) | ("Bangkok", "Text", False)             | 


4. การรวม partition  โดยใช้วิธีการ MBCC

       Base: (True, False), (False, False)

       Test: 2+(2*(2-1) + 2*(2-1)) = 2+4 = 6

       (True, False) -> (True, True), (False, False)

       (False, False) -> (False, True), (True, False)

5. Derive test values

| Characteristic      | b1                           | b2                                     | Expected result  |
|:--------------------|:-----------------------------|:---------------------------------------|:-----------------|
| T1 = (True,False)   | ("Heading", "Text", True)    | ("Bangkok", "A wonderful city", False) | Failed           |
| T2 = (False,False)  | ("Bangkok", "Text", True)    | ("Bangkok", "Text", False)             | Failed           |




-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


# testUpcomingWeekendsObjectCreation()

- ชื่อของ Test case - testUpcomingWeekendsObjectCreation()

- จุดประสงค์ - ตรวจสอบการสร้างอ็อบเจกต์ UpcomingWeekends และทดสอบค่าที่รับเข้ามาในคอนสตรักเตอร์

**Interface-based characteristic**

1. Identify testable functions - testUpcomingWeekendsObjectCreation()
2. Identify parameters, return types, return values, and exceptional behavior
    - Parameters: String mMonth, int mDate, String mDay, String mName, String mType
    - Return type: String
    - Return value: Pass หรือ failed
    - Exceptional behavior: test pass

3. Model the input domain

    - Partition characteristics

| Characteristic         | b1   | b2    |
|:-----------------------|:-----|:------|
| C1 = mMonth is correct | True | False | 
| C2 = mDate is correct  | True | False | 
| C3 = mDay is correct   | True | False | 
| C4 = mName is correct  | True | False | 
| C5 = mType is correct  | True | False | 

    - Identify (possible) values

| Characteristic         | b1            | b2        |
|:-----------------------|:--------------|:----------|
| C1 = mMonth is correct | "November"    | "October" | 
| C2 = mDate is correct  | 5             | 11        | 
| C3 = mDay is correct   | "Saturday"    | "Friday"  | 
| C4 = mName is correct  | "Hiking Trip" | "Sleep"   | 
| C5 = mType is correct  | "Outdoor"     | "Indoor"  | 


4. การรวม partition  โดยใช้วิธีการ MBCC

       Base: ("November", 5, "Saturday", "Hiking Trip", "Outdoor"), ("October", 11, "Friday", "Sleep", "Indoor")

       Test: 2+(2*(2-1) + 2*(2-1) + 2*(2-1) + 2*(2-1) + 2*(2-1)) = 2+10 = 12

       ("November", 5, "Saturday", "Hiking Trip", "Outdoor") --> ("October", 5, "Saturday", "Hiking Trip", "Outdoor"), ("November", 11, "Saturday", "Hiking Trip", "Outdoor"), ("November", 5, "Friday", "Hiking Trip", "Outdoor"), ("November", 5, "Saturday", "Sleep", "Outdoor"), ("November", 5, "Saturday", "Hiking Trip", "Indoor")

       ("October", 11, "Friday", "Sleep", "Indoor") --> ("November", 11, "Friday", "Sleep", "Indoor"), ("October", 5, "Friday", "Sleep", "Indoor"), ("October", 11, "Saturday", "Sleep", "Indoor"), ("October", 11, "Friday", "Hiking Trip", "Indoor"), ("October", 11, "Friday", "Sleep", "Outdoor")

5. Derive test values

| Characteristic     | b1              | b2              | Expected result |
|:-------------------|:----------------|:----------------|:----------------|
| T1 = (True,True)   | "November"      | "November"      | Pass            |
| T2 = (True,False)  | 5               | 11              | Failed          |
| T3 = (True,True)   | "Saturday"      | "Saturday"      | Pass            |
| T4 = (True,False)  | "Hiking Trip"   | "Sleep"         | Failed          |
| T5 = (True,True)   | "Outdoor"       | "Outdoor"       | Pass            |
| T1 = (False,False) | "October"       | "October"       | Failed          |
| T2 = (False,True)  | 11              | 5               | Failed          |
| T3 = (False,False) | "Friday"        | "Friday"        | Failed          |
| T4 = (False,True)  | "Sleep"         | "Hiking Trip"   | Failed          |
| T5 = (False,False) | "Indoor"        | "Indoor"        | Failed          |

**Functionality-based Characteristics**

1. Identify testable functions - testCityHistoryListItemCreation()
2. Identify parameters, return types, return values, and exceptional behavior
    - Parameters: String mHeading, String mText, Boolean mTrimText
    - Return type: String
    - Return value: Pass หรือ failed
    - Exceptional behavior: test pass

3. Model the input domain

    - Partition characteristics

| Characteristic                                  | b1    | b2     |
|:------------------------------------------------|:------|:-------|
| C1 = All parameter matches the specified value  | True  | False  | 
| C2 = Some parameter matches the specified value | False | False  |


    - Identify (possible) values

| Characteristic                                        | b1                                                      | b2                                             |
|:------------------------------------------------------|:--------------------------------------------------------|:-----------------------------------------------|
| C1 = All input parameter matches the specified value  | ("November", 5, "Saturday", "Hiking Trip", "Outdoor")   | ("October", 11, "Friday", "Sleep", "Indoor")   | 
| C2 = Some input parameter matches the specified value | ("November", 5, "Friday", "Hiking Trip", "Outdoor")     | ("October", 11, "Friday", "Sleep", "Outdoor")  | 


4. การรวม partition  โดยใช้วิธีการ MBCC

       Base: (True, False), (False, False)

       Test: 2+(2*(2-1) + 2*(2-1)) = 2+4 = 6

       (True, False) -> (True, True), (False, False)

       (False, False) -> (False, True), (True, False)

5. Derive test values

| Characteristic      | b1                                                      | b2                                             | Expected result  |
|:--------------------|:--------------------------------------------------------|:-----------------------------------------------|:-----------------|
| T1 = (True,False)   | ("November", 5, "Saturday", "Hiking Trip", "Outdoor")   | ("October", 11, "Friday", "Sleep", "Indoor")   | Failed           |
| T2 = (False,False)  | ("November", 5, "Friday", "Hiking Trip", "Outdoor")     | ("October", 11, "Friday", "Sleep", "Outdoor")  | Failed           |



-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


# ZoneName()

1. ชื่อของ test case : testZoneName()
2.  จุดประสงค์ของ test case : ตรวจสอบค่าของ expected กับ actual ว่ามีค่าเท่ากันไหม
3. Characteristic
    * **interface-based characteristic**
        * Identify testable functions - testZoneName()
        * Identify parameters, return type, return values and exceptional behavior
            * Parameter: shortName และ abbreviation
            * return types : String
            * return values : same input
            * exceptional behavior : same input
        * Model the input domain

          | Characteristic                | b1     | b2      |
                    |-------------------------------|--------|---------|
          | C1 = shortName same input     | True   | False   |
          | C2 = abbreviation same input  | True   | False   |

        * Identify (possible) values

          | Characteristic               | b1                     | b2                      |
                    |------------------------------|------------------------|-------------------------|
          | C1 = shortName same input    | "GMT"                  | "PST"                   |
          | C2 = abbreviation same input | "Greenwich Mean Time"  | "Pacific Standard Time" |

        * Derive test values

          | Test               | shortName | abbreviation             | Expected result |
                    |--------------------|-----------|--------------------------|-----------------|
          | T1 = (True,True)   | "GMT"     | "Greenwich Mean Time"    | Test Passed     |
          | T2 = (True,False)  | "GMT"     | "Pacific Standard Time"  | Test Failed     |
          | T3 = (False,True)  | "PST"     | "Greenwich Mean Time"    | Test Failed     |
          | T4 = (False,False) | "PST"     | "Pacific Standard Time"  | Test Failed     |

    * **Functionality-based characteristic**
        * Model the input domain

          | Characteristic                | b1                      | b2                       |
                    |-------------------------------|-------------------------|--------------------------|
          | C1 = shortName same input     | "GMT"                   | "PST"                    |
          | C2 = abbreviation same input  | "Greenwich Mean Time"   | "Pacific Standard Time"  |

            * Derive test values

          | Test               | shortName | abbreviation             | Expected result |
                    |--------------------|-----------|--------------------------|-----------------|
          | T1 = (True,True)   | "GMT"     | "Greenwich Mean Time"    | Test Passed     |


4. การรวม Partition โดยใช้วิธี MBCC

   | Base    | (T,T) (F,F)               |
      |---------|---------------------------|
   | test:   | 2 + (2(2-2) + 2(2-2)) = 2 |
   | result: | Base                      |

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


# Weather()

1. ชื่อของ test case : testWeather()
2.  จุดประสงค์ของ test case : ตรวจสอบค่าของ expected กับ actual ว่ามีค่าเท่ากันไหม
3. Characteristic
    * **interface-based characteristic**
        * Identify testable functions - testWeather()
        * Identify parameters, return type, return values and exceptional behavior
            * Parameter: int imageId, int maxTemp, int minTemp, String dayOfWeek, String date
            * return types : int, string
            * return values : same input
            * exceptional behavior : same input
        * Model the input domain

          | Characteristic            | b1     | b2      |
          |---------------------------|--------|---------|
          | C1 = imageId same input   | True   | False   |
          | C2 = maxTemp same input   | True   | False   |
          | C3 = minTemp  same input  | True   | False   |
          | C4 = dayOfWeek same input | True   | False   |
          | C5 = date same input      | True   | False   |

        * Identify (possible) values

          | Characteristic            | b1           | b2           |
          |---------------------------|--------------|--------------|
          | C1 = imageId same input   | 1            | 30           |
          | C2 = maxTemp same input   | 30           | 10           |
          | C3 = minTemp  same input  | 10           | 1            |
          | C4 = dayOfWeek same input | 'Sunday'     | 'Monday'     |
          | C5 = date same input      | '2023-01-29' | '2022-01-29' |

        * Derive test values

          | Test                                  | imageId | maxTemp | minTemp | dayOfWeek | date         | 
          |---------------------------------------|---------|---------|---------|-----------|--------------|
          | T1 = (True,True,True,True,True)       | 1       | 30      | 10      | 'Sunday'  | '2023-01-29' |
          | T2 = (True,True,True,True,False)      | 1       | 30      | 10      | 'Sunday'  | '2022-01-29' |
          | T3 = (True,True,True,False,False)     | 1       | 30      | 10      | 'Monday'  | '2022-01-29' |
          | T4 = (True,True,False,False,False)    | 1       | 30      | 1       | 'Monday'  | '2022-01-29' |
          | T5 = (True,False,False,False,False)   | 1       | 10      | 1       | 'Monday'  | '2022-01-29' |
          | T6 = (False,True,True,True,True)      | 30      | 30      | 10      | 'Sunday'  | '2023-01-29' |
          | T7 = (False,False,True,True,True)     | 30      | 10      | 10      | 'Sunday'  | '2023-01-29' |
          | T8 = (False,False,False,True,True)    | 30      | 10      | 1       | 'Sunday'  | '2023-01-29' |
          | T9 = (False,False,False,False,True)   | 30      | 10      | 1       | 'Monday'  | '2023-01-29' |
          | T10 = (False,False,False,False,False) | 30      | 10      | 1       | 'Monday'  | '2022-01-29' |
    * **Functionality-based characteristic**
        * Model the input domain

          | Characteristic            | b1           | b2            |
          |---------------------------|--------------|---------------|
          | C1 = imageId same input   | 1            | 30            |
          | C2 = maxTemp same input   | 30           | 10            |
          | C3 = minTemp  same input  | 10           | 1             |
          | C4 = dayOfWeek same input | 'Sunday'     | 'Monday'      |
          | C5 = date same input      | '2023-01-29' | '2022-01-29'  |

            * Derive test values

          | Test                                     | imageId | maxTemp | minTemp | dayOfWeek | date         | Expected result |
          |------------------------------------------|---------|---------|---------|-----------|--------------|-----------------|
          | T1 = (1,30, 10, 'Sunday', '2023-01-29')  | 1       | 30      | 10      | 'Sunday'  | '2023-01-29' | Test Passed     |


4. การรวม Partition โดยใช้วิธี MBCC

   | Base    | (T,T,T,T,T) (F,F,F,F,F)   |
   |---------|---------------------------|
   | test:   | 2 + (2(2-2) + 2(2-2)) = 2 |
   | result: | Base                      |

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# testCreateTripWithValidData()

1. ชื่อของ test case : testCreateTripWithValidData()
2.  จุดประสงค์ของ test case : ตรวจสอบความถูกต้องของค่า Trip
3. Characteristic
    * **interface-based characteristic**
        * Identify testable functions - testCreateTripWithValidData()
        * Identify parameters, return type, return values and exceptional behavior
            * Parameter: string id, string name, string image, string start, string end, string tname, boolean isPublic
            * return types : String
            * return values : same input
            * exceptional behavior : same input
        * Model the input domain

          | Characteristic                   | b1     | b2      |
                    |----------------------------------|--------|---------|
          | C1 = id is 10 digit number       | True   | False   |
          | C2 = name is name of the city    | True   | False   |
          | C3 = image is URL                | True   | False   |
          | C4 = start is "yyyy-mm-dd"       | True   | False   |
          | C5 = end is "yyyy-mm-dd"         | True   | False   |
          | C6 = tname is name of trip       | True   | False   |
          | C7 = isPublic                    | True   | False   |



        * Identify (possible) values

| Characteristic                        | b1                             | b2                      |
          |---------------------------------------|--------------------------------|-------------------------|
          | C1 = id is 10 digit number            | "0000000001"                   | "1"                     |
          | C2 = name is string                   | "Bangkok"                      | "@"                     |
          | C3 = image is URL                     | "https://example.com/trip.png" | "trip.png"              |
          | C4 = start is "yyyy-mm-dd"            | "2023-12-30"                   | "30_Dec_2023"           |
          | C5 = end is "yyyy-mm-dd"              | "2024-01-03"                   | "2024/1/3"              |
          | C6 = tname is string                  | "A-Trip"                       | " "                     |
          | C7 = isPublic                         | true                           | false                   |

        * Derive test values

| Test               | id           | name               | image                             | start        | end          | tname       | isPublic  | Expected result | 
          |--------------------|--------------|--------------------|-----------------------------------|--------------|--------------|-------------|-----------|-----------------|
          | T1 = (True,True,True,True,True,True,True) | "2312300001" | "Greenwich" | "https://trxp.com/trip.png" | "2023-12-30" | "2024-01-03" | "A-Trip" | false | Valid          |
          | T2 = (True,True,True,True,True,True,False) | "2311110011" | "New York" | "https://tourex.com/NY-trip.png" | "2023-11-11" | "2023-11-21" | "NY-Trip" | true  | Valid |
          | T3 = (True,True,True,True,True,False,False) | "2404130012" | "Greenwich" | "https://trxp.com/ZeroDegree-trip.png" | "2024-04-13" | "2024-04-15" | " " | false | Invalid |
          | T4 = (True,True,True,False,False,True,False) | "2402160404" | "Paris" | "https://frtp.com/fr01-24-trip.png" | "16 Feb 2024" | "20 Feb 2024" | "Paris_Trip" | false | Invalid |
          | T5 = (True,True,False,True,True,True,True) | "2408010404" | "Los Angeles" | "LA24-trip.png" | "2024-08-01" | "2024-08-09" | "LA_Trip" | True | Invalid |
          | T6 = (True,False,True,True,True,True,True) | "2501010001" | " " | "https://lctex.com/Q1-25.png" | "2025-01-01" | "2025-01-03" | "LocalTrip" | true | Invalid |
          | T7 = (False,True,True,True,True,True,True) | "0000000404" | "Bangkok" | "https://riverbkk.com/BKK-R.png" | "2025-02-14" | "2025-01-15" | "1 night at Chao Phraya" | true | Invalid |
          | T8 = (False,False,False,False,False,False,False) | "91" | "@" | "unknown.pdf" | "2024/1/3" | "2024/1/5" | " " | false | Invalid |
   
          

    * **Functionality-based characteristic**
        * Model the input domain

| Characteristic                   | b1     | b2      |
          |----------------------------------|--------|---------|
          | C1 = id is 10 digit number       | True   | False   |
          | C2 = name is name of the city    | True   | False   |
          | C3 = image is URL                | True   | False   |
          | C4 = start is "yyyy-mm-dd"       | True   | False   |
          | C5 = end is "yyyy-mm-dd"         | True   | False   |
          | C6 = tname is name of trip       | True   | False   |
          | C7 = isPublic                    | True   | False   |

            * Derive test values

| Test                                  | id           | name               | image                             | start        | end          | tname       | isPublic  | Expected result | 
          |---------------------------------------|--------------|--------------------|-----------------------------------|--------------|--------------|-------------|-----------|-----------------|
          | T1 = (True,True,True,True,True,True,True) | "1234567890" | "Bangkok" | "https://example.com/trip.png"    | "2023-10-30" | "2023-11-06" | "My Trip" | true | Valid |



4. การรวม Partition โดยใช้วิธี ECC

   | ECC     |                           |
      |---------|---------------------------|
   | test:   |  2                        |
   | result: | {(True,True,True,True,True,True,True), (False,False,False,False,False,False,False)} |





------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------






# testSaveTripToDatabase()

1. ชื่อของ test case : testSaveTripToDatabase()
2.  จุดประสงค์ของ test case : ตรวจสอบการทำงานร่วมกันของ Trip ในการบันทึก Trip ลงในฐานข้อมูล
3. Characteristic
    * **interface-based characteristic**
        * Identify testable functions - testSaveTripToDatabase()
        * Identify parameters, return type, return values and exceptional behavior
            * Parameter: string id, string name, string image, string start, string end, string tname, boolean isPublic
            * return types : string
            * return values : same input
            * exceptional behavior : same input
        * Model the input domain

          | Characteristic                   | b1     | b2      |
                    |----------------------------------|--------|---------|
          | C1 = trip is valid               | True   | False   |
          | C2 = can save trip in Database   | True   | False   |
          | C3 = can find trip from Database | True   | False   |



        * Identify (possible) values
          
| Characteristic                   | b1     | b2         |
          |----------------------------------|--------|------------|
          | C1 = trip is valid               | valid  | not valid  |
          | C2 = can save trip in Database   | Yes    | No         |
          | C3 = can find trip from Database | Yes    | No         |


    * **Functionality-based characteristic**
        * Model the input domain

| Characteristic                   | b1     | b2      |
          |----------------------------------|--------|---------|
          | C1 = trip size in Database +1    | True   | False   |
          | C2 = trip equal trip in Database | True   | False   |

  
        * Identify (possible) values
          
| Characteristic                   | b1     | b2      |
          |----------------------------------|--------|---------|
          | C1 = trip size in Database +1    | True   | False |
          | C2 = trip equal trip in Database | equal  | not equal |


            * Derive test values

| Test               | b1                     | b2                  | Expected result             | 
          |--------------------|------------------------|---------------------|-----------------------------|
          | T1 = (True,True)   | trips.size() == 1      | trip = trips.get(0) | SaveToDatabase successfully |


4. การรวม Partition โดยใช้วิธี ECC

   | ECC     |                              |
      |---------|------------------------------|
   | test:   | 2                            |
   | result: | {(True,True), (False,False)} |




------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------





# testSearchTripById()

1. ชื่อของ test case : testSearchTripById()
2.  จุดประสงค์ของ test case : การแสดงรายการ Trip ให้กับผู้ใช้โดยใช้ id
3. Characteristic
    * **interface-based characteristic**
        * Identify testable functions - testSaveTripToDatabase()
        * Identify parameters, return type, return values and exceptional behavior
            * Parameter: string id, string name, string image, string start, string end, string tname, boolean isPublic
            * return types : string
            * return values : same input
            * exceptional behavior : same input
        * Model the input domain

          | Characteristic                       | b1     | b2      |
                    |--------------------------------------|--------|---------|
          | C1 = trip is valid                   | True   | False   |
          | C2 = have trip in Database           | True   | False   |
          | C3 = can find_all trip from Database | True   | False   |



        * Identify (possible) values
          
| Characteristic                       | b1     | b2         |
          |--------------------------------------|--------|------------|
          | C1 = trip is valid                   | valid  | not valid  |
          | C2 = have trip in Database           | Yes    | No         |
          | C3 = can find_all trip from Database | Yes    | No         |


    * **Functionality-based characteristic**
        * Model the input domain

| Characteristic                   | b1     | b2      |
          |----------------------------------|--------|---------|
          | C1 = foundTrip equal findbyID    | True   | False   |
          | C2 = trip equal to foundTrip     | True   | False   |

  
        * Identify (possible) values
          
   | Characteristic                   | b1     | b2        |
   |----------------------------------|--------|-----------|
   | C1 = foundTrip equal findbyID    | equal  | not equal |
   | C2 = trip equal to foundTrip     | equal  | not equal |


            * Derive test values

   | Test               | b1                                   | b2                  | Expected result             | 
   |--------------------|--------------------------------------|---------------------|-----------------------------|
   | T1 = (True,True)   | foundTrip = tripService.findById(id) | trip = foundTrip    | SearchTrip successfully     |


4. การรวม Partition โดยใช้วิธี ECC

   | ECC     |                              |
      |---------|------------------------------|
   | test:   | 2                            |
   | result: | {(True,True), (False,False)} |

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------







/*

MIT License

Copyright (C) 2023 Group2 Course ITDS362_Software Quality Assurance and Testing

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the “Software”), 
to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, 
sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:



The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.



THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 
*/