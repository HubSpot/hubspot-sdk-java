// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.communicationpreferences

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommunicationPreferenceGetUnsubscribeAllStatusParamsTest {

    @Test
    fun create() {
        CommunicationPreferenceGetUnsubscribeAllStatusParams.builder()
            .subscriberIdString("subscriberIdString")
            .channel(CommunicationPreferenceGetUnsubscribeAllStatusParams.Channel.EMAIL)
            .businessUnitId(0L)
            .verbose(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CommunicationPreferenceGetUnsubscribeAllStatusParams.builder()
                .subscriberIdString("subscriberIdString")
                .channel(CommunicationPreferenceGetUnsubscribeAllStatusParams.Channel.EMAIL)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("subscriberIdString")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CommunicationPreferenceGetUnsubscribeAllStatusParams.builder()
                .subscriberIdString("subscriberIdString")
                .channel(CommunicationPreferenceGetUnsubscribeAllStatusParams.Channel.EMAIL)
                .businessUnitId(0L)
                .verbose(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("channel", "EMAIL")
                    .put("businessUnitId", "0")
                    .put("verbose", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CommunicationPreferenceGetUnsubscribeAllStatusParams.builder()
                .subscriberIdString("subscriberIdString")
                .channel(CommunicationPreferenceGetUnsubscribeAllStatusParams.Channel.EMAIL)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("channel", "EMAIL").build())
    }
}
