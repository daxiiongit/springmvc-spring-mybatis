use mybatis;

# 查询用户信息
# (1)根据用户id查找用户信息

select user.id,
	   user.username,
       user.birthday,
       user.sex,
       user.address
    from user where user.id = 1;

# (2)根据用户的其他信息查找用户信息
select user.id,
	   user.username,
       user.birthday,
       user.sex,
       user.address
    from user where user.username like '%大%';
    
# 查询全部用户信息
select * from user;


# 删除用户信息
# (1)根据用户id删除用户信息

# 查询商品信息
# (1)根据商品id查询
select * from items where id = 1;
# (2)查询全部商品信息
select * from items;
