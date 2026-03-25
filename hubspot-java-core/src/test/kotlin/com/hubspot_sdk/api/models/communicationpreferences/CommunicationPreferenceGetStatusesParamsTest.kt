// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.communicationpreferences

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommunicationPreferenceGetStatusesParamsTest {

    @Test
    fun create() {
        CommunicationPreferenceGetStatusesParams.builder()
            .subscriberIdString("subscriberIdString")
            .channel(CommunicationPreferenceGetStatusesParams.Channel.EMAIL)
            .businessUnitId(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CommunicationPreferenceGetStatusesParams.builder()
                .subscriberIdString("subscriberIdString")
                .channel(CommunicationPreferenceGetStatusesParams.Channel.EMAIL)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("subscriberIdString")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CommunicationPreferenceGetStatusesParams.builder()
                .subscriberIdString("subscriberIdString")
                .channel(CommunicationPreferenceGetStatusesParams.Channel.EMAIL)
                .businessUnitId(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("channel", "EMAIL").put("businessUnitId", "0").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CommunicationPreferenceGetStatusesParams.builder()
                .subscriberIdString("subscriberIdString")
                .channel(CommunicationPreferenceGetStatusesParams.Channel.EMAIL)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("channel", "EMAIL").build())
    }
}
