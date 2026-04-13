// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSingleFieldDependencyTest {

    @Test
    fun create() {
        val publicSingleFieldDependency =
            PublicSingleFieldDependency.builder()
                .controllingFieldName("controllingFieldName")
                .dependencyType(PublicSingleFieldDependency.DependencyType.SINGLE_FIELD)
                .addDependentFieldName("string")
                .build()

        assertThat(publicSingleFieldDependency.controllingFieldName())
            .isEqualTo("controllingFieldName")
        assertThat(publicSingleFieldDependency.dependencyType())
            .isEqualTo(PublicSingleFieldDependency.DependencyType.SINGLE_FIELD)
        assertThat(publicSingleFieldDependency.dependentFieldNames()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSingleFieldDependency =
            PublicSingleFieldDependency.builder()
                .controllingFieldName("controllingFieldName")
                .dependencyType(PublicSingleFieldDependency.DependencyType.SINGLE_FIELD)
                .addDependentFieldName("string")
                .build()

        val roundtrippedPublicSingleFieldDependency =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSingleFieldDependency),
                jacksonTypeRef<PublicSingleFieldDependency>(),
            )

        assertThat(roundtrippedPublicSingleFieldDependency).isEqualTo(publicSingleFieldDependency)
    }
}
