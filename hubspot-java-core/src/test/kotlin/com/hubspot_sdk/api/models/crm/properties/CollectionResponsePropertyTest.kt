// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.properties

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.Option
import com.hubspot_sdk.api.models.PreviousPage
import com.hubspot_sdk.api.models.Property
import com.hubspot_sdk.api.models.PropertyModificationMetadata
import com.hubspot_sdk.api.models.marketing.emails.Paging
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePropertyTest {

    @Test
    fun create() {
        val collectionResponseProperty =
            CollectionResponseProperty.builder()
                .addResult(
                    Property.builder()
                        .description("")
                        .fieldType("select")
                        .groupName("my_object_information")
                        .label("My object property")
                        .name("my_object_property")
                        .addOption(
                            Option.builder()
                                .description("Choice number one")
                                .displayOrder(1)
                                .doubleData(0.0)
                                .hidden(false)
                                .label("Option A")
                                .readOnly(false)
                                .value("A")
                                .build()
                        )
                        .addOption(
                            Option.builder()
                                .description("Choice number two")
                                .displayOrder(2)
                                .doubleData(0.0)
                                .hidden(false)
                                .label("Option B")
                                .readOnly(false)
                                .value("B")
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
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseProperty.results())
            .containsExactly(
                Property.builder()
                    .description("")
                    .fieldType("select")
                    .groupName("my_object_information")
                    .label("My object property")
                    .name("my_object_property")
                    .addOption(
                        Option.builder()
                            .description("Choice number one")
                            .displayOrder(1)
                            .doubleData(0.0)
                            .hidden(false)
                            .label("Option A")
                            .readOnly(false)
                            .value("A")
                            .build()
                    )
                    .addOption(
                        Option.builder()
                            .description("Choice number two")
                            .displayOrder(2)
                            .doubleData(0.0)
                            .hidden(false)
                            .label("Option B")
                            .readOnly(false)
                            .value("B")
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
        assertThat(collectionResponseProperty.paging())
            .contains(
                Paging.builder()
                    .next(NextPage.builder().after("").link("").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseProperty =
            CollectionResponseProperty.builder()
                .addResult(
                    Property.builder()
                        .description("")
                        .fieldType("select")
                        .groupName("my_object_information")
                        .label("My object property")
                        .name("my_object_property")
                        .addOption(
                            Option.builder()
                                .description("Choice number one")
                                .displayOrder(1)
                                .doubleData(0.0)
                                .hidden(false)
                                .label("Option A")
                                .readOnly(false)
                                .value("A")
                                .build()
                        )
                        .addOption(
                            Option.builder()
                                .description("Choice number two")
                                .displayOrder(2)
                                .doubleData(0.0)
                                .hidden(false)
                                .label("Option B")
                                .readOnly(false)
                                .value("B")
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
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseProperty =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseProperty),
                jacksonTypeRef<CollectionResponseProperty>(),
            )

        assertThat(roundtrippedCollectionResponseProperty).isEqualTo(collectionResponseProperty)
    }
}
