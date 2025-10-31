// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.limits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ObjectTypeDefinitionLabels
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectTypeDefinition
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationLabelLimitResponseTest {

    @Test
    fun create() {
        val associationLabelLimitResponse =
            AssociationLabelLimitResponse.builder()
                .addAllLabel("string")
                .fromObjectType(
                    ObjectTypeDefinition.builder()
                        .id("123456")
                        .labels(
                            ObjectTypeDefinitionLabels.builder()
                                .plural("My objects")
                                .singular("My object")
                                .build()
                        )
                        .name("my_object")
                        .addRequiredProperty("my_object_property")
                        .archived(true)
                        .createdAt(OffsetDateTime.parse("2020-02-20T18:07:11.390Z"))
                        .description("description")
                        .fullyQualifiedName("fullyQualifiedName")
                        .objectTypeId("objectTypeId")
                        .portalId(12345678)
                        .primaryDisplayProperty("my_object_property")
                        .addSearchableProperty("my_object_property")
                        .addSecondaryDisplayProperty("string")
                        .updatedAt(OffsetDateTime.parse("2020-02-21T14:13:28.818002Z"))
                        .build()
                )
                .limit(0)
                .percentage(0.0)
                .toObjectType(
                    ObjectTypeDefinition.builder()
                        .id("123456")
                        .labels(
                            ObjectTypeDefinitionLabels.builder()
                                .plural("My objects")
                                .singular("My object")
                                .build()
                        )
                        .name("my_object")
                        .addRequiredProperty("my_object_property")
                        .archived(true)
                        .createdAt(OffsetDateTime.parse("2020-02-20T18:07:11.390Z"))
                        .description("description")
                        .fullyQualifiedName("fullyQualifiedName")
                        .objectTypeId("objectTypeId")
                        .portalId(12345678)
                        .primaryDisplayProperty("my_object_property")
                        .addSearchableProperty("my_object_property")
                        .addSecondaryDisplayProperty("string")
                        .updatedAt(OffsetDateTime.parse("2020-02-21T14:13:28.818002Z"))
                        .build()
                )
                .usage(0)
                .build()

        assertThat(associationLabelLimitResponse.allLabels()).containsExactly("string")
        assertThat(associationLabelLimitResponse.fromObjectType())
            .isEqualTo(
                ObjectTypeDefinition.builder()
                    .id("123456")
                    .labels(
                        ObjectTypeDefinitionLabels.builder()
                            .plural("My objects")
                            .singular("My object")
                            .build()
                    )
                    .name("my_object")
                    .addRequiredProperty("my_object_property")
                    .archived(true)
                    .createdAt(OffsetDateTime.parse("2020-02-20T18:07:11.390Z"))
                    .description("description")
                    .fullyQualifiedName("fullyQualifiedName")
                    .objectTypeId("objectTypeId")
                    .portalId(12345678)
                    .primaryDisplayProperty("my_object_property")
                    .addSearchableProperty("my_object_property")
                    .addSecondaryDisplayProperty("string")
                    .updatedAt(OffsetDateTime.parse("2020-02-21T14:13:28.818002Z"))
                    .build()
            )
        assertThat(associationLabelLimitResponse.limit()).isEqualTo(0)
        assertThat(associationLabelLimitResponse.percentage()).isEqualTo(0.0)
        assertThat(associationLabelLimitResponse.toObjectType())
            .isEqualTo(
                ObjectTypeDefinition.builder()
                    .id("123456")
                    .labels(
                        ObjectTypeDefinitionLabels.builder()
                            .plural("My objects")
                            .singular("My object")
                            .build()
                    )
                    .name("my_object")
                    .addRequiredProperty("my_object_property")
                    .archived(true)
                    .createdAt(OffsetDateTime.parse("2020-02-20T18:07:11.390Z"))
                    .description("description")
                    .fullyQualifiedName("fullyQualifiedName")
                    .objectTypeId("objectTypeId")
                    .portalId(12345678)
                    .primaryDisplayProperty("my_object_property")
                    .addSearchableProperty("my_object_property")
                    .addSecondaryDisplayProperty("string")
                    .updatedAt(OffsetDateTime.parse("2020-02-21T14:13:28.818002Z"))
                    .build()
            )
        assertThat(associationLabelLimitResponse.usage()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val associationLabelLimitResponse =
            AssociationLabelLimitResponse.builder()
                .addAllLabel("string")
                .fromObjectType(
                    ObjectTypeDefinition.builder()
                        .id("123456")
                        .labels(
                            ObjectTypeDefinitionLabels.builder()
                                .plural("My objects")
                                .singular("My object")
                                .build()
                        )
                        .name("my_object")
                        .addRequiredProperty("my_object_property")
                        .archived(true)
                        .createdAt(OffsetDateTime.parse("2020-02-20T18:07:11.390Z"))
                        .description("description")
                        .fullyQualifiedName("fullyQualifiedName")
                        .objectTypeId("objectTypeId")
                        .portalId(12345678)
                        .primaryDisplayProperty("my_object_property")
                        .addSearchableProperty("my_object_property")
                        .addSecondaryDisplayProperty("string")
                        .updatedAt(OffsetDateTime.parse("2020-02-21T14:13:28.818002Z"))
                        .build()
                )
                .limit(0)
                .percentage(0.0)
                .toObjectType(
                    ObjectTypeDefinition.builder()
                        .id("123456")
                        .labels(
                            ObjectTypeDefinitionLabels.builder()
                                .plural("My objects")
                                .singular("My object")
                                .build()
                        )
                        .name("my_object")
                        .addRequiredProperty("my_object_property")
                        .archived(true)
                        .createdAt(OffsetDateTime.parse("2020-02-20T18:07:11.390Z"))
                        .description("description")
                        .fullyQualifiedName("fullyQualifiedName")
                        .objectTypeId("objectTypeId")
                        .portalId(12345678)
                        .primaryDisplayProperty("my_object_property")
                        .addSearchableProperty("my_object_property")
                        .addSecondaryDisplayProperty("string")
                        .updatedAt(OffsetDateTime.parse("2020-02-21T14:13:28.818002Z"))
                        .build()
                )
                .usage(0)
                .build()

        val roundtrippedAssociationLabelLimitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associationLabelLimitResponse),
                jacksonTypeRef<AssociationLabelLimitResponse>(),
            )

        assertThat(roundtrippedAssociationLabelLimitResponse)
            .isEqualTo(associationLabelLimitResponse)
    }
}
