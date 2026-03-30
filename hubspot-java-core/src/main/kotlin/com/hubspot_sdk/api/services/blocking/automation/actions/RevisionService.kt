// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation.actions

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.automation.actions.PublicActionRevision
import com.hubspot_sdk.api.models.automation.actions.revisions.RevisionGetParams
import com.hubspot_sdk.api.models.automation.actions.revisions.RevisionListPage
import com.hubspot_sdk.api.models.automation.actions.revisions.RevisionListParams
import java.util.function.Consumer

interface RevisionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RevisionService

    /** Retrieve the versions of a definition by ID. */
    fun list(definitionId: String, params: RevisionListParams): RevisionListPage =
        list(definitionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        definitionId: String,
        params: RevisionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RevisionListPage =
        list(params.toBuilder().definitionId(definitionId).build(), requestOptions)

    /** @see list */
    fun list(params: RevisionListParams): RevisionListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RevisionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RevisionListPage

    /** Retrieve a specific revision of a definition by revision ID. */
    fun get(revisionId: String, params: RevisionGetParams): PublicActionRevision =
        get(revisionId, params, RequestOptions.none())

    /** @see get */
    fun get(
        revisionId: String,
        params: RevisionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionRevision = get(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see get */
    fun get(params: RevisionGetParams): PublicActionRevision = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: RevisionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionRevision

    /** A view of [RevisionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RevisionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /automation/actions/2026-03/{appId}/{definitionId}/revisions`, but is otherwise the same
         * as [RevisionService.list].
         */
        @MustBeClosed
        fun list(
            definitionId: String,
            params: RevisionListParams,
        ): HttpResponseFor<RevisionListPage> = list(definitionId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            definitionId: String,
            params: RevisionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RevisionListPage> =
            list(params.toBuilder().definitionId(definitionId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: RevisionListParams): HttpResponseFor<RevisionListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RevisionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RevisionListPage>

        /**
         * Returns a raw HTTP response for `get
         * /automation/actions/2026-03/{appId}/{definitionId}/revisions/{revisionId}`, but is
         * otherwise the same as [RevisionService.get].
         */
        @MustBeClosed
        fun get(
            revisionId: String,
            params: RevisionGetParams,
        ): HttpResponseFor<PublicActionRevision> = get(revisionId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            revisionId: String,
            params: RevisionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionRevision> =
            get(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: RevisionGetParams): HttpResponseFor<PublicActionRevision> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: RevisionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionRevision>
    }
}
