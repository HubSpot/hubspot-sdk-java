// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IsPortalMulticurrencyEnabledTest {

    @Test
    fun create() {
        val isPortalMulticurrencyEnabled =
            IsPortalMulticurrencyEnabled.builder()
                .operator(IsPortalMulticurrencyEnabled.Operator.IS_PORTAL_MULTICURRENCY_ENABLED)
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(isPortalMulticurrencyEnabled.operator())
            .isEqualTo(IsPortalMulticurrencyEnabled.Operator.IS_PORTAL_MULTICURRENCY_ENABLED)
        assertThat(isPortalMulticurrencyEnabled.propertyName()).contains("propertyName")
        assertThat(isPortalMulticurrencyEnabled.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val isPortalMulticurrencyEnabled =
            IsPortalMulticurrencyEnabled.builder()
                .operator(IsPortalMulticurrencyEnabled.Operator.IS_PORTAL_MULTICURRENCY_ENABLED)
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedIsPortalMulticurrencyEnabled =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(isPortalMulticurrencyEnabled),
                jacksonTypeRef<IsPortalMulticurrencyEnabled>(),
            )

        assertThat(roundtrippedIsPortalMulticurrencyEnabled).isEqualTo(isPortalMulticurrencyEnabled)
    }
}
