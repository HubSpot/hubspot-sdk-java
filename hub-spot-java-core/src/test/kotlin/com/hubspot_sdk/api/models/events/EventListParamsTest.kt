// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventListParamsTest {

    @Test
    fun create() {
        EventListParams.builder()
            .addId("string")
            .after("after")
            .before("before")
            .eventType("eventType")
            .limit(0)
            .objectId(0L)
            .objectProperty(
                EventListParams.ObjectProperty.builder()
                    .propname(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
            .objectType("objectType")
            .occurredAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .occurredBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .property(
                EventListParams.Property.builder()
                    .propname(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
            .addSort("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EventListParams.builder()
                .addId("string")
                .after("after")
                .before("before")
                .eventType("eventType")
                .limit(0)
                .objectId(0L)
                .objectProperty(
                    EventListParams.ObjectProperty.builder()
                        .propname(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .objectType("objectType")
                .occurredAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .occurredBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .property(
                    EventListParams.Property.builder()
                        .propname(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .addSort("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", listOf("string").joinToString(","))
                    .put("after", "after")
                    .put("before", "before")
                    .put("eventType", "eventType")
                    .put("limit", "0")
                    .put("objectId", "0")
                    .put("objectType", "objectType")
                    .put("occurredAfter", "2019-12-27T18:11:19.117Z")
                    .put("occurredBefore", "2019-12-27T18:11:19.117Z")
                    .put("sort", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EventListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
