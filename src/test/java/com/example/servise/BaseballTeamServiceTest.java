package com.example.servise;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.BaseballTeam;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseballTeamServiceTest {
	
	@Autowired
	private BaseballTeamService service;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testShowList() {
			System.out.println("全件検索するテスト開始");
			
			
			List<BaseballTeam> teamList = service.showList();
			
			assertThat("件数が一致しません", teamList.size(), is(6));
			assertThat("発足日順に並んでいません", teamList.get(0).getTeamName(), is("読売ジャイアンツ"));
			assertThat("発足日順に並んでいません", teamList.get(5).getTeamName(), is("東京ヤクルトスワローズ"));
			
			System.out.println("全件検索するテスト終了");
		}
	
	@Test
	public void testShowDetail() {
		System.out.println("詳細表示するテスト開始");
		assertThat("詳細が間違っています" ,service.showDetail("読売ジャイアンツ").getHeadquarters(), is("東京ドーム（東京都・文京区）"));
		assertThat("詳細が間違っています" ,service.showDetail("阪神タイガース").getHeadquarters(), is("阪神甲子園球場（兵庫県・西宮市）"));
		assertThat("詳細が間違っています" ,service.showDetail("東京ヤクルトスワローズ").getHeadquarters(), is("明治神宮野球場（東京都・新宿区）"));
		
		
		System.out.println("詳細表示するテスト終了");
	}

}
