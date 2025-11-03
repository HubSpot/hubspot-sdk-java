// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.properties

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.Option
import com.hubspot_sdk.api.models.Property
import com.hubspot_sdk.api.models.PropertyModificationMetadata
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreatedResponsePropertyTest {

    @Test
    fun create() {
        val createdResponseProperty =
            CreatedResponseProperty.builder()
                .createdResourceId("createdResourceId")
                .entity(
                    Property.builder()
                        .description("")
                        .fieldType("select")
                        .groupName("my_object_information")
                        .label("My object property")
                        .name("my_object_property")
                        .addOption(
                            Option.builder()
                                .hidden(false)
                                .label("Option A")
                                .value("A")
                                .description("Choice number one")
                                .displayOrder(1)
                                .build()
                        )
                        .addOption(
                            Option.builder()
                                .hidden(false)
                                .label("Option B")
                                .value("B")
                                .description("Choice number two")
                                .displayOrder(2)
                                .build()
                        )
                        .type("enumeration")
                        .archived(false)
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .calculated(false)
                        .calculationFormula("")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdUserId("")
                        .dataSensitivity(Property.DataSensitivity.NON_SENSITIVE)
                        .displayOrder(2)
                        .externalOptions(false)
                        .formField(false)
                        .hasUniqueValue(false)
                        .hidden(false)
                        .hubspotDefined(false)
                        .modificationMetadata(
                            PropertyModificationMetadata.builder()
                                .archivable(true)
                                .readOnlyDefinition(false)
                                .readOnlyValue(false)
                                .readOnlyOptions(false)
                                .build()
                        )
                        .referencedObjectType("")
                        .addSensitiveDataCategory("string")
                        .showCurrencySymbol(false)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedUserId("updatedUserId")
                        .build()
                )
                .location("location")
                .build()

        assertThat(createdResponseProperty.createdResourceId()).isEqualTo("createdResourceId")
        assertThat(createdResponseProperty.entity())
            .isEqualTo(
                Property.builder()
                    .description("")
                    .fieldType("select")
                    .groupName("my_object_information")
                    .label("My object property")
                    .name("my_object_property")
                    .addOption(
                        Option.builder()
                            .hidden(false)
                            .label("Option A")
                            .value("A")
                            .description("Choice number one")
                            .displayOrder(1)
                            .build()
                    )
                    .addOption(
                        Option.builder()
                            .hidden(false)
                            .label("Option B")
                            .value("B")
                            .description("Choice number two")
                            .displayOrder(2)
                            .build()
                    )
                    .type("enumeration")
                    .archived(false)
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .calculated(false)
                    .calculationFormula("")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdUserId("")
                    .dataSensitivity(Property.DataSensitivity.NON_SENSITIVE)
                    .displayOrder(2)
                    .externalOptions(false)
                    .formField(false)
                    .hasUniqueValue(false)
                    .hidden(false)
                    .hubspotDefined(false)
                    .modificationMetadata(
                        PropertyModificationMetadata.builder()
                            .archivable(true)
                            .readOnlyDefinition(false)
                            .readOnlyValue(false)
                            .readOnlyOptions(false)
                            .build()
                    )
                    .referencedObjectType("")
                    .addSensitiveDataCategory("string")
                    .showCurrencySymbol(false)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedUserId("updatedUserId")
                    .build()
            )
        assertThat(createdResponseProperty.location()).contains("location")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createdResponseProperty =
            CreatedResponseProperty.builder()
                .createdResourceId("createdResourceId")
                .entity(
                    Property.builder()
                        .description("")
                        .fieldType("select")
                        .groupName("my_object_information")
                        .label("My object property")
                        .name("my_object_property")
                        .addOption(
                            Option.builder()
                                .hidden(false)
                                .label("Option A")
                                .value("A")
                                .description("Choice number one")
                                .displayOrder(1)
                                .build()
                        )
                        .addOption(
                            Option.builder()
                                .hidden(false)
                                .label("Option B")
                                .value("B")
                                .description("Choice number two")
                                .displayOrder(2)
                                .build()
                        )
                        .type("enumeration")
                        .archived(false)
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .calculated(false)
                        .calculationFormula("")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdUserId("")
                        .dataSensitivity(Property.DataSensitivity.NON_SENSITIVE)
                        .displayOrder(2)
                        .externalOptions(false)
                        .formField(false)
                        .hasUniqueValue(false)
                        .hidden(false)
                        .hubspotDefined(false)
                        .modificationMetadata(
                            PropertyModificationMetadata.builder()
                                .archivable(true)
                                .readOnlyDefinition(false)
                                .readOnlyValue(false)
                                .readOnlyOptions(false)
                                .build()
                        )
                        .referencedObjectType("")
                        .addSensitiveDataCategory("string")
                        .showCurrencySymbol(false)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedUserId("updatedUserId")
                        .build()
                )
                .location("location")
                .build()

        val roundtrippedCreatedResponseProperty =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createdResponseProperty),
                jacksonTypeRef<CreatedResponseProperty>(),
            )

        assertThat(roundtrippedCreatedResponseProperty).isEqualTo(createdResponseProperty)
    }
}
