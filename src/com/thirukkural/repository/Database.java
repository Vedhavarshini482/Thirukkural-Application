package com.thirukkural.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.thirukkural.dto.Properties;

public class Database {
	Connection con;

	public Database() {
		startConnect();
	}

	public void exit() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void startConnect() {
		String url = "jdbc:mysql://localhost:3306/thirukkuralapplication";
		String username = "root";
		String password = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}

	public Properties getSpecificKural(String number) {
		Properties properties = new Properties();
		int id = Integer.parseInt(number);
		try {
			PreparedStatement statement = con.prepareStatement("SELECT * FROM kural WHERE kuralNo=?");
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				properties = new Properties(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
						rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14),
						rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19),
						rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return properties;
	}

	public List<Properties> getSpecificAthikaramArathupaal(String number) {
		List<Properties> list = new ArrayList<>();
		String adhikaram = "அறத்துப்பால்";
		int start = (Integer.parseInt(number) * 10) - 10;
		int end = Integer.parseInt(number) * 10;
		try {
			PreparedStatement statement = con
					.prepareStatement("SELECT * FROM kural WHERE palTamil=? AND kuralNo>=? AND kuralNo<=?");
			statement.setString(1, adhikaram);
			statement.setInt(2, start);
			statement.setInt(3, end);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Properties peroperties = new Properties(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
						rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13),
						rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18),
						rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23));
				list.add(peroperties);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public List<Properties> getSpecificAthikaramPorutpaal(String number) {
		List<Properties> list = new ArrayList<>();
		String adhikaram = "பொருட்பால்";
		int start = (Integer.parseInt(number) * 10) - 10;
		int end = Integer.parseInt(number) * 10;
		try {
			PreparedStatement statement = con
					.prepareStatement("SELECT * FROM kural WHERE palTamil=? AND kuralNo>=? AND kuralNo<=?");
			statement.setString(1, adhikaram);
			statement.setInt(2, start);
			statement.setInt(3, end);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Properties peroperties = new Properties(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
						rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13),
						rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18),
						rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23));
				list.add(peroperties);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<Properties> getSpecificAthikaramInbathupaal(String number) {
		List<Properties> list = new ArrayList<>();
		String adhikaram = "இன்பத்துப்பால்";
		int start = (Integer.parseInt(number) * 10) - 10;
		int end = Integer.parseInt(number) * 10;
		try {
			PreparedStatement statement = con
					.prepareStatement("SELECT * FROM kural WHERE palTamil=? AND kuralNo>=? AND kuralNo<=?");
			statement.setString(1, adhikaram);
			statement.setInt(2, start);
			statement.setInt(3, end);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Properties peroperties = new Properties(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
						rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13),
						rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18),
						rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23));
				list.add(peroperties);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<Properties> displayArathupaal() {
		List<Properties> list = new ArrayList<>();
		String adhikaram = "அறத்துப்பால்";
		try {
			PreparedStatement statement = con.prepareStatement("SELECT * FROM kural WHERE palTamil=?");
			statement.setString(1, adhikaram);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Properties peroperties = new Properties(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
						rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13),
						rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18),
						rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23));
				list.add(peroperties);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public List<Properties> displayPorutpaal() {
		List<Properties> list = new ArrayList<>();
		String adhikaram = "பொருட்பால்";
		try {
			PreparedStatement statement = con.prepareStatement("SELECT * FROM kural WHERE palTamil=?");
			statement.setString(1, adhikaram);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Properties peroperties = new Properties(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
						rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13),
						rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18),
						rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23));
				list.add(peroperties);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public List<Properties> displayInbathupaal() {
		List<Properties> list = new ArrayList<>();
		String adhikaram = "இன்பத்துப்பால்";

		try {
			PreparedStatement statement = con.prepareStatement("SELECT * FROM kural WHERE palTamil=? ");
			statement.setString(1, adhikaram);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Properties peroperties = new Properties(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
						rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13),
						rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18),
						rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23));
				list.add(peroperties);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

}