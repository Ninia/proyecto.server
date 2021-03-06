package ud.binmonkey.prog3_proyecto_server.http;

import ud.binmonkey.prog3_proyecto_server.common.network.URI;

import java.util.HashMap;

/**
 * Custom html parser
 */
@SuppressWarnings("WeakerAccess")
public class HtmlParser {

    private static HashMap<String, String> parseRules = new HashMap<String, String>() {{
       put("%{url}", "http://" + URI.getHost("http-server") + ":" + URI.getPort("http-server"));
    }};

    @SuppressWarnings("WeakerAccess")
    public static String parse(String html) {
        for (String rule : parseRules.keySet()) {
            html = html.replace(rule, parseRules.get(rule));
        }
        return html;
    }
}
