// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.currencies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseCurrencyCodeInfoNoPagingTest {

    @Test
    fun create() {
        val collectionResponseCurrencyCodeInfoNoPaging =
            CollectionResponseCurrencyCodeInfoNoPaging.builder()
                .addResult(
                    CurrencyCodeInfo.builder()
                        .currencyCode("currencyCode")
                        .currencyName("currencyName")
                        .build()
                )
                .build()

        assertThat(collectionResponseCurrencyCodeInfoNoPaging.results())
            .containsExactly(
                CurrencyCodeInfo.builder()
                    .currencyCode("currencyCode")
                    .currencyName("currencyName")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseCurrencyCodeInfoNoPaging =
            CollectionResponseCurrencyCodeInfoNoPaging.builder()
                .addResult(
                    CurrencyCodeInfo.builder()
                        .currencyCode("currencyCode")
                        .currencyName("currencyName")
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseCurrencyCodeInfoNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseCurrencyCodeInfoNoPaging),
                jacksonTypeRef<CollectionResponseCurrencyCodeInfoNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponseCurrencyCodeInfoNoPaging)
            .isEqualTo(collectionResponseCurrencyCodeInfoNoPaging)
    }
}
