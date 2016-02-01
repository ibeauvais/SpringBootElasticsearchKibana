FROM elasticsearch:1.7.4

COPY elasticsearch.yml /usr/share/elasticsearch/config/elasticsearch.yml

RUN /usr/share/elasticsearch/bin/plugin --install lmenezes/elasticsearch-kopf/v1.6.1
RUN /usr/share/elasticsearch/bin/plugin --install elasticsearch/marvel/latest


