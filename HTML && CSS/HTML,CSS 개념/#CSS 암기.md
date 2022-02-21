3가지 기억하기!!!

- # 1. position

  1-1. static : 고정  
  1-2. relative : 원래 위치에서 움직임  
  1-3. absolute : 자기 마음대로 움직임

  ## \*\*\*(absolute는 부모태그가 relative면 relative(부모태그)기준으로 움직임)

  1-4. fixed : 고정(스크롤을 내려도 위치 고정!)

- # 2. padding , margin , box-size

  2-1. padding : 부모태그와 자식태그 간격 조절. 부모태그에 작성  
   2-2. margin : 부모와 부모 간격 조절. 부모태그에 작성  
   2-3. box-size : border-box

- # 3. flex(or inline-block)
  3-1 container 와 item으로 구성 (배열)  
   3-2 container의 길이와 item 간격을 유연하게 조절
  ## \*\*\*display : flex(default는 row(가로로 보기))
  3-3 []=container / {}=item -> [{item,item,item...}] container안에 item들로 구성;

# 이외의 다른개념

- div.container = body태그라고 생각하면 된다. <-> flex의 container와 다른 개념

```html
- div.hello.hello${$}*3 =>
<div class="hello hello1">1</div>
<div class="hello hello2">2</div>
<div class="hello hello3">3</div>
```
