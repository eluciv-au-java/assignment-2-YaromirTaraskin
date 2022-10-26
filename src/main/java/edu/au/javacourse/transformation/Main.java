package edu.au.javacourse.transformation;

import edu.au.javacourse.input.InputReader;
import edu.au.javacourse.input.InputTransformation;

import java.io.IOException;

public class Main {

	/**
	 * Программа читает набор трансформаций из файла, переданного в качестве первого параметра при запуске.
	 * Трансформации в файле заданы в формате JSON. Пример:
	 * [
	 *   { "type": "rotate", "alpha": 90},
	 *   { "type": "translate", "dx": 5, "dy": -3},
	 *   { "type": "scale", "kx": 1, "ky": -1}
	 * ]
	 * Угол поворота указывается в градусах (т.к. иначе трудно иметь дело с Math.PI при чтении из JSON).
	 * Трансформации применяются в том порядке, в каком они заданы в JSON.
	 *
	 * Чтение из файла уже сделано.
	 * Ваша задача:
	 * 1) реализовать библиотеку трансформаций;
	 * 2) продемонстрировать ее работу: для этого - заменить все 'TODO' в этом методе и применить набор трансформаций
	 * к точке.
	 *
	 * При запуске программе должны быть переданы три параметра:
	 * 1) имя файла с набором трансформаций;
	 * 2) Х-координата точки для проверки;
	 * 3) Y-координата точки для проверки.
	 *
	 * Сборка запускается командной строкой (из корневой директории репозитория):
	 *    mvnw clean package
	 *
	 * После сборки программа запускается строкой (из корневой директории репозитория):
	 *    java -jar "target/transformations-jar-with-dependencies.jar" <имя_файла_с_трансформациями> <X> <Y>
	 * Пример:
	 *    java -jar "target/transformations-jar-with-dependencies.jar" ".\input.json" 10 4.5
	 */
	public static void main(String[] args) throws IOException {
		if (args.length == 0) {
			System.out.println("Ошибка: не указано имя файла с данными");
			return;
		}

		// Читаем данные в формате JSON из файла, переданного программе в первом аргументе
		String fileName = args[0];
		InputTransformation[] inputTransformations = InputReader.read(fileName);

		/*
		 1) Создаем общую трансформацию: new AffineTransformation()
		 2) Итерируем по трансформациям, прочитанным из файла.
		    Для каждой создаем элементарную трансформацию соответствующего типа и "добавляем" к общей трансформации
		 */
		/* TODO раскомментировать цикл
		for (InputTransformation inputItem : inputTransformations) {
			AffineTransformation t =
					switch (inputItem.getType()) {
						case "rotate" -> // TODO создаем вращение на угол `Math.toRadians(inputItem.getAlpha())`
						case "translate" -> // TODO создаем перенос на (inputItem.getDx(), inputItem.getDy())
						case "scale" -> // TODO создаем растяжение на (inputItem.getKx(), inputItem.getKy())
						default -> throw new RuntimeException("Неизвестный тип трансформации");
					};
			// TODO добавляем t к общей трансформации
		}
		*/

		/*
		Применяем полученную трансформацию к точке с координатами, переданными во втором и третьем аргументах запуска
		программы
		 */
		if (args.length < 3) {
			System.out.println("Не указаны координаты точки");
			return;
		}
		double x = Double.parseDouble(args[1]);
		double y = Double.parseDouble(args[2]);
		// 1) TODO создаем объект Point
		// 2) TODO применяем трансформацию к созданной точке
		// 3) TODO Выводим результат на печать в формате (result_x, result_y). Например: (2.5, -3.998)
	}

}
