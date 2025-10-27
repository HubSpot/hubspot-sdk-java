// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations.v4

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.BatchResponsePublicDefaultAssociation
import com.hubspot_sdk.api.models.crm.associations.v4.BatchResponseLabelsBetweenObjectPair
import com.hubspot_sdk.api.models.crm.associations.v4.BatchResponsePublicAssociationMultiWithLabel
import com.hubspot_sdk.api.models.crm.associations.v4.BatchResponseVoid
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchBatchAssociateDefaultParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchBatchCreateParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchBatchDeleteLabelsParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchBatchDeleteParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchBatchReadParams
import java.util.function.Consumer

interface BatchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService

    /** Create the default (most generic) association type between two object types */
    fun batchAssociateDefault(
        toObjectType: String,
        params: BatchBatchAssociateDefaultParams,
    ): BatchResponsePublicDefaultAssociation =
        batchAssociateDefault(toObjectType, params, RequestOptions.none())

    /** @see batchAssociateDefault */
    fun batchAssociateDefault(
        toObjectType: String,
        params: BatchBatchAssociateDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicDefaultAssociation =
        batchAssociateDefault(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see batchAssociateDefault */
    fun batchAssociateDefault(
        params: BatchBatchAssociateDefaultParams
    ): BatchResponsePublicDefaultAssociation = batchAssociateDefault(params, RequestOptions.none())

    /** @see batchAssociateDefault */
    fun batchAssociateDefault(
        params: BatchBatchAssociateDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicDefaultAssociation

    /** Batch create associations for objects */
    fun batchCreate(
        toObjectType: String,
        params: BatchBatchCreateParams,
    ): BatchResponseLabelsBetweenObjectPair =
        batchCreate(toObjectType, params, RequestOptions.none())

    /** @see batchCreate */
    fun batchCreate(
        toObjectType: String,
        params: BatchBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseLabelsBetweenObjectPair =
        batchCreate(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see batchCreate */
    fun batchCreate(params: BatchBatchCreateParams): BatchResponseLabelsBetweenObjectPair =
        batchCreate(params, RequestOptions.none())

    /** @see batchCreate */
    fun batchCreate(
        params: BatchBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseLabelsBetweenObjectPair

    /** Batch delete associations for objects */
    fun batchDelete(toObjectType: String, params: BatchBatchDeleteParams): BatchResponseVoid =
        batchDelete(toObjectType, params, RequestOptions.none())

    /** @see batchDelete */
    fun batchDelete(
        toObjectType: String,
        params: BatchBatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseVoid =
        batchDelete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see batchDelete */
    fun batchDelete(params: BatchBatchDeleteParams): BatchResponseVoid =
        batchDelete(params, RequestOptions.none())

    /** @see batchDelete */
    fun batchDelete(
        params: BatchBatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseVoid

    /**
     * Batch delete specific association labels for objects. Deleting an unlabeled association will
     * also delete all labeled associations between those two objects
     */
    fun batchDeleteLabels(
        toObjectType: String,
        params: BatchBatchDeleteLabelsParams,
    ): BatchResponseVoid = batchDeleteLabels(toObjectType, params, RequestOptions.none())

    /** @see batchDeleteLabels */
    fun batchDeleteLabels(
        toObjectType: String,
        params: BatchBatchDeleteLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseVoid =
        batchDeleteLabels(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see batchDeleteLabels */
    fun batchDeleteLabels(params: BatchBatchDeleteLabelsParams): BatchResponseVoid =
        batchDeleteLabels(params, RequestOptions.none())

    /** @see batchDeleteLabels */
    fun batchDeleteLabels(
        params: BatchBatchDeleteLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseVoid

    /**
     * Batch read associations for objects to specific object type. The 'after' field in a returned
     * paging object can be added alongside the 'id' to retrieve the next page of associations from
     * that objectId. The 'link' field is deprecated and should be ignored. Note: The 'paging' field
     * will only be present if there are more pages and absent otherwise.
     */
    fun batchRead(
        toObjectType: String,
        params: BatchBatchReadParams,
    ): BatchResponsePublicAssociationMultiWithLabel =
        batchRead(toObjectType, params, RequestOptions.none())

    /** @see batchRead */
    fun batchRead(
        toObjectType: String,
        params: BatchBatchReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociationMultiWithLabel =
        batchRead(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see batchRead */
    fun batchRead(params: BatchBatchReadParams): BatchResponsePublicAssociationMultiWithLabel =
        batchRead(params, RequestOptions.none())

    /** @see batchRead */
    fun batchRead(
        params: BatchBatchReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociationMultiWithLabel

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/associate/default`, but is
         * otherwise the same as [BatchService.batchAssociateDefault].
         */
        @MustBeClosed
        fun batchAssociateDefault(
            toObjectType: String,
            params: BatchBatchAssociateDefaultParams,
        ): HttpResponseFor<BatchResponsePublicDefaultAssociation> =
            batchAssociateDefault(toObjectType, params, RequestOptions.none())

        /** @see batchAssociateDefault */
        @MustBeClosed
        fun batchAssociateDefault(
            toObjectType: String,
            params: BatchBatchAssociateDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicDefaultAssociation> =
            batchAssociateDefault(
                params.toBuilder().toObjectType(toObjectType).build(),
                requestOptions,
            )

        /** @see batchAssociateDefault */
        @MustBeClosed
        fun batchAssociateDefault(
            params: BatchBatchAssociateDefaultParams
        ): HttpResponseFor<BatchResponsePublicDefaultAssociation> =
            batchAssociateDefault(params, RequestOptions.none())

        /** @see batchAssociateDefault */
        @MustBeClosed
        fun batchAssociateDefault(
            params: BatchBatchAssociateDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicDefaultAssociation>

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/create`, but is otherwise the
         * same as [BatchService.batchCreate].
         */
        @MustBeClosed
        fun batchCreate(
            toObjectType: String,
            params: BatchBatchCreateParams,
        ): HttpResponseFor<BatchResponseLabelsBetweenObjectPair> =
            batchCreate(toObjectType, params, RequestOptions.none())

        /** @see batchCreate */
        @MustBeClosed
        fun batchCreate(
            toObjectType: String,
            params: BatchBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseLabelsBetweenObjectPair> =
            batchCreate(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see batchCreate */
        @MustBeClosed
        fun batchCreate(
            params: BatchBatchCreateParams
        ): HttpResponseFor<BatchResponseLabelsBetweenObjectPair> =
            batchCreate(params, RequestOptions.none())

        /** @see batchCreate */
        @MustBeClosed
        fun batchCreate(
            params: BatchBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseLabelsBetweenObjectPair>

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/archive`, but is otherwise the
         * same as [BatchService.batchDelete].
         */
        @MustBeClosed
        fun batchDelete(
            toObjectType: String,
            params: BatchBatchDeleteParams,
        ): HttpResponseFor<BatchResponseVoid> =
            batchDelete(toObjectType, params, RequestOptions.none())

        /** @see batchDelete */
        @MustBeClosed
        fun batchDelete(
            toObjectType: String,
            params: BatchBatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseVoid> =
            batchDelete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see batchDelete */
        @MustBeClosed
        fun batchDelete(params: BatchBatchDeleteParams): HttpResponseFor<BatchResponseVoid> =
            batchDelete(params, RequestOptions.none())

        /** @see batchDelete */
        @MustBeClosed
        fun batchDelete(
            params: BatchBatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseVoid>

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/labels/archive`, but is
         * otherwise the same as [BatchService.batchDeleteLabels].
         */
        @MustBeClosed
        fun batchDeleteLabels(
            toObjectType: String,
            params: BatchBatchDeleteLabelsParams,
        ): HttpResponseFor<BatchResponseVoid> =
            batchDeleteLabels(toObjectType, params, RequestOptions.none())

        /** @see batchDeleteLabels */
        @MustBeClosed
        fun batchDeleteLabels(
            toObjectType: String,
            params: BatchBatchDeleteLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseVoid> =
            batchDeleteLabels(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see batchDeleteLabels */
        @MustBeClosed
        fun batchDeleteLabels(
            params: BatchBatchDeleteLabelsParams
        ): HttpResponseFor<BatchResponseVoid> = batchDeleteLabels(params, RequestOptions.none())

        /** @see batchDeleteLabels */
        @MustBeClosed
        fun batchDeleteLabels(
            params: BatchBatchDeleteLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseVoid>

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/read`, but is otherwise the
         * same as [BatchService.batchRead].
         */
        @MustBeClosed
        fun batchRead(
            toObjectType: String,
            params: BatchBatchReadParams,
        ): HttpResponseFor<BatchResponsePublicAssociationMultiWithLabel> =
            batchRead(toObjectType, params, RequestOptions.none())

        /** @see batchRead */
        @MustBeClosed
        fun batchRead(
            toObjectType: String,
            params: BatchBatchReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociationMultiWithLabel> =
            batchRead(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see batchRead */
        @MustBeClosed
        fun batchRead(
            params: BatchBatchReadParams
        ): HttpResponseFor<BatchResponsePublicAssociationMultiWithLabel> =
            batchRead(params, RequestOptions.none())

        /** @see batchRead */
        @MustBeClosed
        fun batchRead(
            params: BatchBatchReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociationMultiWithLabel>
    }
}
