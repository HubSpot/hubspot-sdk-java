// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.cardsdev

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardsDevMigrateViewsParamsTest {

    @Test
    fun create() {
        CardsDevMigrateViewsParams.builder()
            .appId(0)
            .cardMigrateViewsRequest(
                CardMigrateViewsRequest.builder()
                    .appCardId(0L)
                    .legacyCrmCardId(0L)
                    .helpdeskAppCardId(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardsDevMigrateViewsParams.builder()
                .appId(0)
                .cardMigrateViewsRequest(
                    CardMigrateViewsRequest.builder().appCardId(0L).legacyCrmCardId(0L).build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CardsDevMigrateViewsParams.builder()
                .appId(0)
                .cardMigrateViewsRequest(
                    CardMigrateViewsRequest.builder()
                        .appCardId(0L)
                        .legacyCrmCardId(0L)
                        .helpdeskAppCardId(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CardMigrateViewsRequest.builder()
                    .appCardId(0L)
                    .legacyCrmCardId(0L)
                    .helpdeskAppCardId(0L)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardsDevMigrateViewsParams.builder()
                .appId(0)
                .cardMigrateViewsRequest(
                    CardMigrateViewsRequest.builder().appCardId(0L).legacyCrmCardId(0L).build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(CardMigrateViewsRequest.builder().appCardId(0L).legacyCrmCardId(0L).build())
    }
}
