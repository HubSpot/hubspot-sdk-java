// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAccessRuleTest {

    @Test
    fun create() {
        val publicAccessRule = PublicAccessRule.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAccessRule = PublicAccessRule.builder().build()

        val roundtrippedPublicAccessRule =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAccessRule),
                jacksonTypeRef<PublicAccessRule>(),
            )

        assertThat(roundtrippedPublicAccessRule).isEqualTo(publicAccessRule)
    }
}
