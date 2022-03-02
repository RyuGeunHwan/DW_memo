### grid 문법)

```
display : grid
grid-template-rows/columns : repeat(auto-fit/fill, minmax(250px,auto))
gap : 50px 30px
```

## display : grid;

```
1. grid만 정의 하였을 경우에는 아무일도 일어나지 않는다.
```

## grid-template-rows/columns

```
★ grid-template-rows/columns :
    1. (컬럼갯수만큼 정의) 200px 400px ...
    2. 1fr 1fr...(grid컨테이너의 넓이만큼 1 : 1의 크기로 나눔)
       (fr = fraction 숫자의 비율대로 크기를 나눔 1fr 2fr = 1:2비율)
    3. 100px 2fr 1fr... 도 가능!
        (첫번째 컬럼 100px 두번째 컬럼 2 : 1 세번째 컬럼 )
    4. repeat(반복횟수, 반복값)
         ex) repeat(5, 1fr) / repeat(3, 2fr 1fr 3fr) / repeat(auto-fit) 가능!

```

## repeat(반복횟수, 반복값)

```
repeat(반복횟수, 반복값)
 1. 반복횟수 = grid컨테이너 안에 한 행에 최대 몇개의 컬럼을 배열 할 것인지
 2. 반복값 = 배열 크기 설정(1fr , 250px 등등)
```

## minmax(최솟값,최댓값)

```
★ minmax(최솟값,최댓값)
    1. 사용예시 -> grid-template-rows: repeat(3, minmax(최솟값,최댓값));
    2. ex) minmax(200px,auto)
    아무리 내용의 양이 적더라도 최소한 높이 200px은 확보하고, 내용이 많아 200px이 넘어가면 자동으로 늘어나도록 처리
```

## auto-fill / fit

```
1. fill과 fit의 공통점
    컬럼의 개수를 미리 정하지 않고 grid 컨테이너에 설정된 너비가 허용하는 한 최대한 셀을 채움.

2. fill과 fit의 차이점
2-1) fill = repeat의 반복횟수를 5로 지정하였는데 컬럼이 4개 밖에 없을때 1개의 공간은 남겨놓음.
2-2) fit = repeat의 반복횟수를 5로 지정하였는데 컬럼이 4개 밖에 없을때 1개의 공간은 남겨놓지 않고 빈공간을 채움.
```

## grid-gap / row-gap / gap - grid item끼리 간격만들기

```
1. row-gap: 10px;       /* row의 간격을 10px로 */
    row = 행과 행 사이의 간격
2. column-gap: 20px;     /* column의 간격을 20px로 */
    column = 컬럼과 컬럼 사이의 간격
3. 	gap: 10px 20px;     /* row-gap: 10px; column-gap: 20px; */
4. gap: 20px;       /* row-gap: 20px; column-gap: 20px; */
```
