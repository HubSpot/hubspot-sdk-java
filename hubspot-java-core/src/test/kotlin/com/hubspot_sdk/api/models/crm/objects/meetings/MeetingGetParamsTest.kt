// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.meetings

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingGetParamsTest {

    @Test
    fun create() {
        MeetingGetParams.builder()
            .meetingId("meetingId")
            .archived(true)
            .addAssociation("string")
            .idProperty("idProperty")
            .addProperty("string")
            .addPropertiesWithHistory("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = MeetingGetParams.builder().meetingId("meetingId").build()

        assertThat(params._pathParam(0)).isEqualTo("meetingId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            MeetingGetParams.builder()
                .meetingId("meetingId")
                .archived(true)
                .addAssociation("string")
                .idProperty("idProperty")
                .addProperty("string")
                .addPropertiesWithHistory("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("archived", "true")
                    .put("associations", listOf("string").joinToString(","))
                    .put("idProperty", "idProperty")
                    .put("properties", listOf("string").joinToString(","))
                    .put("propertiesWithHistory", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MeetingGetParams.builder().meetingId("meetingId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
