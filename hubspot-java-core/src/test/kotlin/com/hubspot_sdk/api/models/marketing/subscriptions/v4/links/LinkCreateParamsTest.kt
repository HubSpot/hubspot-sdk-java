// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions.v4.links

import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.LinkGenerationRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LinkCreateParamsTest {

    @Test
    fun create() {
        LinkCreateParams.builder()
            .channel(LinkCreateParams.Channel.EMAIL)
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
            LinkCreateParams.builder()
                .channel(LinkCreateParams.Channel.EMAIL)
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
            LinkCreateParams.builder()
                .channel(LinkCreateParams.Channel.EMAIL)
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
            LinkCreateParams.builder()
                .channel(LinkCreateParams.Channel.EMAIL)
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
            LinkCreateParams.builder()
                .channel(LinkCreateParams.Channel.EMAIL)
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
