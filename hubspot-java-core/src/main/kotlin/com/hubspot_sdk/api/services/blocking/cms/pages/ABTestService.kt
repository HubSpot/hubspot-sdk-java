// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.pages

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.AbTestCreateRequestVNext
import com.hubspot_sdk.api.models.cms.pages.AbTestEndRequestVNext
import com.hubspot_sdk.api.models.cms.pages.AbTestRerunRequestVNext
import com.hubspot_sdk.api.models.cms.pages.Page
import com.hubspot_sdk.api.models.cms.pages.abtests.ABTestCreateAbTestVariationParams
import com.hubspot_sdk.api.models.cms.pages.abtests.ABTestEndAbTestParams
import com.hubspot_sdk.api.models.cms.pages.abtests.ABTestRerunAbTestParams
import java.util.function.Consumer

interface ABTestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ABTestService

    /** Create a new A/B test variation based on the information provided in the request body. */
    fun createAbTestVariation(params: ABTestCreateAbTestVariationParams): Page =
        createAbTestVariation(params, RequestOptions.none())

    /** @see createAbTestVariation */
    fun createAbTestVariation(
        params: ABTestCreateAbTestVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /** @see createAbTestVariation */
    fun createAbTestVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page =
        createAbTestVariation(
            ABTestCreateAbTestVariationParams.builder()
                .abTestCreateRequestVNext(abTestCreateRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createAbTestVariation */
    fun createAbTestVariation(abTestCreateRequestVNext: AbTestCreateRequestVNext): Page =
        createAbTestVariation(abTestCreateRequestVNext, RequestOptions.none())

    /** End an active A/B test and designate a winner. */
    fun endAbTest(params: ABTestEndAbTestParams) = endAbTest(params, RequestOptions.none())

    /** @see endAbTest */
    fun endAbTest(
        params: ABTestEndAbTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see endAbTest */
    fun endAbTest(
        abTestEndRequestVNext: AbTestEndRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        endAbTest(
            ABTestEndAbTestParams.builder().abTestEndRequestVNext(abTestEndRequestVNext).build(),
            requestOptions,
        )

    /** @see endAbTest */
    fun endAbTest(abTestEndRequestVNext: AbTestEndRequestVNext) =
        endAbTest(abTestEndRequestVNext, RequestOptions.none())

    /** Rerun a previous A/B test. */
    fun rerunAbTest(params: ABTestRerunAbTestParams) = rerunAbTest(params, RequestOptions.none())

    /** @see rerunAbTest */
    fun rerunAbTest(
        params: ABTestRerunAbTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see rerunAbTest */
    fun rerunAbTest(
        abTestRerunRequestVNext: AbTestRerunRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        rerunAbTest(
            ABTestRerunAbTestParams.builder()
                .abTestRerunRequestVNext(abTestRerunRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see rerunAbTest */
    fun rerunAbTest(abTestRerunRequestVNext: AbTestRerunRequestVNext) =
        rerunAbTest(abTestRerunRequestVNext, RequestOptions.none())

    /** A view of [ABTestService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ABTestService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/ab-test/create-variation`, but is otherwise the same as
         * [ABTestService.createAbTestVariation].
         */
        @MustBeClosed
        fun createAbTestVariation(
            params: ABTestCreateAbTestVariationParams
        ): HttpResponseFor<Page> = createAbTestVariation(params, RequestOptions.none())

        /** @see createAbTestVariation */
        @MustBeClosed
        fun createAbTestVariation(
            params: ABTestCreateAbTestVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /** @see createAbTestVariation */
        @MustBeClosed
        fun createAbTestVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            createAbTestVariation(
                ABTestCreateAbTestVariationParams.builder()
                    .abTestCreateRequestVNext(abTestCreateRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createAbTestVariation */
        @MustBeClosed
        fun createAbTestVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext
        ): HttpResponseFor<Page> =
            createAbTestVariation(abTestCreateRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/ab-test/end`, but is
         * otherwise the same as [ABTestService.endAbTest].
         */
        @MustBeClosed
        fun endAbTest(params: ABTestEndAbTestParams): HttpResponse =
            endAbTest(params, RequestOptions.none())

        /** @see endAbTest */
        @MustBeClosed
        fun endAbTest(
            params: ABTestEndAbTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see endAbTest */
        @MustBeClosed
        fun endAbTest(
            abTestEndRequestVNext: AbTestEndRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            endAbTest(
                ABTestEndAbTestParams.builder()
                    .abTestEndRequestVNext(abTestEndRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see endAbTest */
        @MustBeClosed
        fun endAbTest(abTestEndRequestVNext: AbTestEndRequestVNext): HttpResponse =
            endAbTest(abTestEndRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/ab-test/rerun`, but
         * is otherwise the same as [ABTestService.rerunAbTest].
         */
        @MustBeClosed
        fun rerunAbTest(params: ABTestRerunAbTestParams): HttpResponse =
            rerunAbTest(params, RequestOptions.none())

        /** @see rerunAbTest */
        @MustBeClosed
        fun rerunAbTest(
            params: ABTestRerunAbTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see rerunAbTest */
        @MustBeClosed
        fun rerunAbTest(
            abTestRerunRequestVNext: AbTestRerunRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            rerunAbTest(
                ABTestRerunAbTestParams.builder()
                    .abTestRerunRequestVNext(abTestRerunRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see rerunAbTest */
        @MustBeClosed
        fun rerunAbTest(abTestRerunRequestVNext: AbTestRerunRequestVNext): HttpResponse =
            rerunAbTest(abTestRerunRequestVNext, RequestOptions.none())
    }
}
