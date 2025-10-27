// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation.actions

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.automation.actions.PublicActionRevision
import com.hubspot_sdk.api.models.automation.actions.revisions.RevisionListPage
import com.hubspot_sdk.api.models.automation.actions.revisions.RevisionListParams
import com.hubspot_sdk.api.models.automation.actions.revisions.RevisionReadParams
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
    fun read(revisionId: String, params: RevisionReadParams): PublicActionRevision =
        read(revisionId, params, RequestOptions.none())

    /** @see read */
    fun read(
        revisionId: String,
        params: RevisionReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionRevision =
        read(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see read */
    fun read(params: RevisionReadParams): PublicActionRevision = read(params, RequestOptions.none())

    /** @see read */
    fun read(
        params: RevisionReadParams,
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
         * /automation/v4/actions/{appId}/{definitionId}/revisions`, but is otherwise the same as
         * [RevisionService.list].
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
         * /automation/v4/actions/{appId}/{definitionId}/revisions/{revisionId}`, but is otherwise
         * the same as [RevisionService.read].
         */
        @MustBeClosed
        fun read(
            revisionId: String,
            params: RevisionReadParams,
        ): HttpResponseFor<PublicActionRevision> = read(revisionId, params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(
            revisionId: String,
            params: RevisionReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionRevision> =
            read(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see read */
        @MustBeClosed
        fun read(params: RevisionReadParams): HttpResponseFor<PublicActionRevision> =
            read(params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(
            params: RevisionReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionRevision>
    }
}
