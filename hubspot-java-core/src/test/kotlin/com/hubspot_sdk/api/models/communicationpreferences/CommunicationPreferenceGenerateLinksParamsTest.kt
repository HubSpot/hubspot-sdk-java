// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.communicationpreferences

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommunicationPreferenceGenerateLinksParamsTest {

    @Test
    fun create() {
        CommunicationPreferenceGenerateLinksParams.builder()
            .channel(CommunicationPreferenceGenerateLinksParams.Channel.EMAIL)
            .businessUnitId(0L)
            .linkGenerationRequest(
                LinkGenerationRequest.builder()
                    .subscriberIdString("subscriberIdString")
                    .language("language")
                    .subscriptionId(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CommunicationPreferenceGenerateLinksParams.builder()
                .channel(CommunicationPreferenceGenerateLinksParams.Channel.EMAIL)
                .businessUnitId(0L)
                .linkGenerationRequest(
                    LinkGenerationRequest.builder()
                        .subscriberIdString("subscriberIdString")
                        .language("language")
                        .subscriptionId(0L)
                        .build()
                )
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
            CommunicationPreferenceGenerateLinksParams.builder()
                .channel(CommunicationPreferenceGenerateLinksParams.Channel.EMAIL)
                .linkGenerationRequest(
                    LinkGenerationRequest.builder().subscriberIdString("subscriberIdString").build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("channel", "EMAIL").build())
    }

    @Test
    fun body() {
        val params =
            CommunicationPreferenceGenerateLinksParams.builder()
                .channel(CommunicationPreferenceGenerateLinksParams.Channel.EMAIL)
                .businessUnitId(0L)
                .linkGenerationRequest(
                    LinkGenerationRequest.builder()
                        .subscriberIdString("subscriberIdString")
                        .language("language")
                        .subscriptionId(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                LinkGenerationRequest.builder()
                    .subscriberIdString("subscriberIdString")
                    .language("language")
                    .subscriptionId(0L)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CommunicationPreferenceGenerateLinksParams.builder()
                .channel(CommunicationPreferenceGenerateLinksParams.Channel.EMAIL)
                .linkGenerationRequest(
                    LinkGenerationRequest.builder().subscriberIdString("subscriberIdString").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                LinkGenerationRequest.builder().subscriberIdString("subscriberIdString").build()
            )
    }
}
