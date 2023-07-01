create table member(
	m_id varchar2(50),
	m_nick varchar2(50),
	m_password varchar2(50),
	m_passwordCheck varchar2(50),
	m_myoji varchar2(30),
	m_name varchar2(30),
	m_year varchar2(30),
	m_month varchar2(30),
	m_date varchar2(30),
	m_phone1 varchar2(30),
	m_phone2 varchar2(30),
	m_phone3 varchar2(30)
);

select * from member;

drop table member;
