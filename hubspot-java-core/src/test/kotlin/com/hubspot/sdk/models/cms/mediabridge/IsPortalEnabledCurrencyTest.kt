// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IsPortalEnabledCurrencyTest {

    @Test
    fun create() {
        val isPortalEnabledCurrency =
            IsPortalEnabledCurrency.builder()
                .operator(IsPortalEnabledCurrency.Operator.IS_PORTAL_ENABLED_CURRENCY)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(isPortalEnabledCurrency.operator())
            .isEqualTo(IsPortalEnabledCurrency.Operator.IS_PORTAL_ENABLED_CURRENCY)
        assertThat(isPortalEnabledCurrency.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(isPortalEnabledCurrency.propertyName()).contains("propertyName")
        assertThat(isPortalEnabledCurrency.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val isPortalEnabledCurrency =
            IsPortalEnabledCurrency.builder()
                .operator(IsPortalEnabledCurrency.Operator.IS_PORTAL_ENABLED_CURRENCY)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedIsPortalEnabledCurrency =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(isPortalEnabledCurrency),
                jacksonTypeRef<IsPortalEnabledCurrency>(),
            )

        assertThat(roundtrippedIsPortalEnabledCurrency).isEqualTo(isPortalEnabledCurrency)
    }
}
