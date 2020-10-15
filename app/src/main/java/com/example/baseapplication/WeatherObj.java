package com.example.baseapplication;

import com.google.gson.annotations.SerializedName;

public class WeatherObj {

    @SerializedName("args")
    private ArgsBean _$Args3; // FIXME check this code
    private HeadersBean headers;
    private String origin;
    private String url;

    public ArgsBean get_$Args3() {
        return _$Args3;
    }

    public void set_$Args3(ArgsBean _$Args3) {
        this._$Args3 = _$Args3;
    }

    public HeadersBean getHeaders() {
        return headers;
    }

    public void setHeaders(HeadersBean headers) {
        this.headers = headers;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "WeatherObj{" +
                "_$Args3=" + _$Args3 +
                ", headers=" + headers +
                ", origin='" + origin + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public static class ArgsBean {
    }

    public static class HeadersBean {
        @SerializedName("Accept")
        private String _$Accept267; // FIXME check this code
        @SerializedName("Accept-Encoding")
        private String AcceptEncoding;
        @SerializedName("Accept-Language")
        private String AcceptLanguage;
        private String Host;
        @SerializedName("Upgrade-Insecure-Requests")
        private String UpgradeInsecureRequests;
        @SerializedName("User-Agent")
        private String UserAgent;
        @SerializedName("X-Amzn-Trace-Id")
        private String XAmznTraceId;

        public String get_$Accept267() {
            return _$Accept267;
        }

        public void set_$Accept267(String _$Accept267) {
            this._$Accept267 = _$Accept267;
        }

        public String getAcceptEncoding() {
            return AcceptEncoding;
        }

        public void setAcceptEncoding(String AcceptEncoding) {
            this.AcceptEncoding = AcceptEncoding;
        }

        public String getAcceptLanguage() {
            return AcceptLanguage;
        }

        public void setAcceptLanguage(String AcceptLanguage) {
            this.AcceptLanguage = AcceptLanguage;
        }

        public String getHost() {
            return Host;
        }

        public void setHost(String Host) {
            this.Host = Host;
        }

        public String getUpgradeInsecureRequests() {
            return UpgradeInsecureRequests;
        }

        public void setUpgradeInsecureRequests(String UpgradeInsecureRequests) {
            this.UpgradeInsecureRequests = UpgradeInsecureRequests;
        }

        public String getUserAgent() {
            return UserAgent;
        }

        public void setUserAgent(String UserAgent) {
            this.UserAgent = UserAgent;
        }

        public String getXAmznTraceId() {
            return XAmznTraceId;
        }

        public void setXAmznTraceId(String XAmznTraceId) {
            this.XAmznTraceId = XAmznTraceId;
        }
    }
}