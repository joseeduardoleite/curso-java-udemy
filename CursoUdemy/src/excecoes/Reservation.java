package excecoes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/*Problema exemplo
Fazer um programa para ler os dados de uma reserva de hotel (n�mero do quarto, data
de entrada e data de sa�da) e mostrar os dados da reserva, inclusive sua dura��o em
dias. Em seguida, ler novas datas de entrada e sa�da, atualizar a reserva, e mostrar
novamente a reserva com os dados atualizados. O programa n�o deve aceitar dados
inv�lidos para a reserva, conforme as seguintes regras:
- Altera��es de reserva s� podem ocorrer para datas futuras
- A data de sa�da deve ser maior que a data de entrada*/
public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() { }
	
	public Reservation(Integer roomNumber, Date checkin, Date checkout) {
		this.roomNumber = roomNumber;
		this.checkIn = checkin;
		this.checkOut = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkIn;
	}

	public Date getCheckout() {
		return checkOut;
	}
	
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime(); // getTime() - devolve a quantidade de milisegundos da data
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // Convers�o do diff que estava em milisegundos (MILLISECONDS) para dias (DAYS)
		// TimeUnit � um tipo enumerado complexo que tem algumas opera��es
	}
	
	public void updateDates(Date checkin, Date checkout) {
		this.checkIn = checkin;
		this.checkOut = checkout;
	}
	
	@Override
	public String toString() {
		return "Room " + roomNumber + ", check-in: " + sdf.format(checkIn) + ", check-out: " + sdf.format(checkOut) + ", " + duration() + " nights";
	}
}
