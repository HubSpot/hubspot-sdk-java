// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations.schema.v4

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.associations.schema.v4.CollectionResponseAssociationSpecWithLabel
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionCreateLabelParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionDeleteLabelParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionListLabelsParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionUpdateLabelParams
import java.util.function.Consumer

interface DefinitionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DefinitionService

    fun createLabel(
        toObjectType: String,
        params: DefinitionCreateLabelParams,
    ): CollectionResponseAssociationSpecWithLabel =
        createLabel(toObjectType, params, RequestOptions.none())

    /** @see createLabel */
    fun createLabel(
        toObjectType: String,
        params: DefinitionCreateLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseAssociationSpecWithLabel =
        createLabel(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see createLabel */
    fun createLabel(
        params: DefinitionCreateLabelParams
    ): CollectionResponseAssociationSpecWithLabel = createLabel(params, RequestOptions.none())

    /** @see createLabel */
    fun createLabel(
        params: DefinitionCreateLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseAssociationSpecWithLabel

    fun deleteLabel(associationTypeId: Int, params: DefinitionDeleteLabelParams) =
        deleteLabel(associationTypeId, params, RequestOptions.none())

    /** @see deleteLabel */
    fun deleteLabel(
        associationTypeId: Int,
        params: DefinitionDeleteLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteLabel(params.toBuilder().associationTypeId(associationTypeId).build(), requestOptions)

    /** @see deleteLabel */
    fun deleteLabel(params: DefinitionDeleteLabelParams) =
        deleteLabel(params, RequestOptions.none())

    /** @see deleteLabel */
    fun deleteLabel(
        params: DefinitionDeleteLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    fun listLabels(
        toObjectType: String,
        params: DefinitionListLabelsParams,
    ): CollectionResponseAssociationSpecWithLabel =
        listLabels(toObjectType, params, RequestOptions.none())

    /** @see listLabels */
    fun listLabels(
        toObjectType: String,
        params: DefinitionListLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseAssociationSpecWithLabel =
        listLabels(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see listLabels */
    fun listLabels(params: DefinitionListLabelsParams): CollectionResponseAssociationSpecWithLabel =
        listLabels(params, RequestOptions.none())

    /** @see listLabels */
    fun listLabels(
        params: DefinitionListLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseAssociationSpecWithLabel

    fun updateLabel(toObjectType: String, params: DefinitionUpdateLabelParams) =
        updateLabel(toObjectType, params, RequestOptions.none())

    /** @see updateLabel */
    fun updateLabel(
        toObjectType: String,
        params: DefinitionUpdateLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = updateLabel(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see updateLabel */
    fun updateLabel(params: DefinitionUpdateLabelParams) =
        updateLabel(params, RequestOptions.none())

    /** @see updateLabel */
    fun updateLabel(
        params: DefinitionUpdateLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [DefinitionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DefinitionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/v4/{fromObjectType}/{toObjectType}/labels`, but is otherwise the same
         * as [DefinitionService.createLabel].
         */
        @MustBeClosed
        fun createLabel(
            toObjectType: String,
            params: DefinitionCreateLabelParams,
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabel> =
            createLabel(toObjectType, params, RequestOptions.none())

        /** @see createLabel */
        @MustBeClosed
        fun createLabel(
            toObjectType: String,
            params: DefinitionCreateLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabel> =
            createLabel(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see createLabel */
        @MustBeClosed
        fun createLabel(
            params: DefinitionCreateLabelParams
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabel> =
            createLabel(params, RequestOptions.none())

        /** @see createLabel */
        @MustBeClosed
        fun createLabel(
            params: DefinitionCreateLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabel>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/associations/v4/{fromObjectType}/{toObjectType}/labels/{associationTypeId}`, but is
         * otherwise the same as [DefinitionService.deleteLabel].
         */
        @MustBeClosed
        fun deleteLabel(associationTypeId: Int, params: DefinitionDeleteLabelParams): HttpResponse =
            deleteLabel(associationTypeId, params, RequestOptions.none())

        /** @see deleteLabel */
        @MustBeClosed
        fun deleteLabel(
            associationTypeId: Int,
            params: DefinitionDeleteLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteLabel(
                params.toBuilder().associationTypeId(associationTypeId).build(),
                requestOptions,
            )

        /** @see deleteLabel */
        @MustBeClosed
        fun deleteLabel(params: DefinitionDeleteLabelParams): HttpResponse =
            deleteLabel(params, RequestOptions.none())

        /** @see deleteLabel */
        @MustBeClosed
        fun deleteLabel(
            params: DefinitionDeleteLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /crm/associations/v4/{fromObjectType}/{toObjectType}/labels`, but is otherwise the same
         * as [DefinitionService.listLabels].
         */
        @MustBeClosed
        fun listLabels(
            toObjectType: String,
            params: DefinitionListLabelsParams,
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabel> =
            listLabels(toObjectType, params, RequestOptions.none())

        /** @see listLabels */
        @MustBeClosed
        fun listLabels(
            toObjectType: String,
            params: DefinitionListLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabel> =
            listLabels(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see listLabels */
        @MustBeClosed
        fun listLabels(
            params: DefinitionListLabelsParams
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabel> =
            listLabels(params, RequestOptions.none())

        /** @see listLabels */
        @MustBeClosed
        fun listLabels(
            params: DefinitionListLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabel>

        /**
         * Returns a raw HTTP response for `put
         * /crm/associations/v4/{fromObjectType}/{toObjectType}/labels`, but is otherwise the same
         * as [DefinitionService.updateLabel].
         */
        @MustBeClosed
        fun updateLabel(toObjectType: String, params: DefinitionUpdateLabelParams): HttpResponse =
            updateLabel(toObjectType, params, RequestOptions.none())

        /** @see updateLabel */
        @MustBeClosed
        fun updateLabel(
            toObjectType: String,
            params: DefinitionUpdateLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            updateLabel(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see updateLabel */
        @MustBeClosed
        fun updateLabel(params: DefinitionUpdateLabelParams): HttpResponse =
            updateLabel(params, RequestOptions.none())

        /** @see updateLabel */
        @MustBeClosed
        fun updateLabel(
            params: DefinitionUpdateLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
