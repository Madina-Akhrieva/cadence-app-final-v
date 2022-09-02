package com.example.activityworker.service.temp;

import com.persistance.dto.TempDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class GetTempService {

    private final String URI = "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s%s";

    private final String API_ID = "84bb1ecc57cc7d532297adad642cf687";

    private final String METRIC = "&units=metric";

    public TempDto getWeatherFromAPI(String cityName) {
        RestTemplate template = new RestTemplate();
        return template.getForObject(getUrl(cityName), TempDto.class);
    }

    private String getUrl(String cityName) {
        return String.format(URI, cityName, API_ID, METRIC);
    }
}
