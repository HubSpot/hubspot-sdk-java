// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestRequestContextTest {

    @Test
    fun create() {
        val testRequestContext =
            TestRequestContext.builder().source(TestRequestContext.Source.TEST).build()

        assertThat(testRequestContext.source()).isEqualTo(TestRequestContext.Source.TEST)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val testRequestContext =
            TestRequestContext.builder().source(TestRequestContext.Source.TEST).build()

        val roundtrippedTestRequestContext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(testRequestContext),
                jacksonTypeRef<TestRequestContext>(),
            )

        assertThat(roundtrippedTestRequestContext).isEqualTo(testRequestContext)
    }
}
