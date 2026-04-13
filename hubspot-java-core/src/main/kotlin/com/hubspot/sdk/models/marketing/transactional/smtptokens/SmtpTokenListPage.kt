// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.transactional.smtptokens

import com.hubspot.sdk.core.AutoPager
import com.hubspot.sdk.core.Page
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.models.marketing.transactional.CollectionResponseSmtpApiTokenViewForwardPaging
import com.hubspot.sdk.models.marketing.transactional.SmtpApiTokenView
import com.hubspot.sdk.services.blocking.marketing.transactional.SmtpTokenService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see SmtpTokenService.list */
class SmtpTokenListPage
private constructor(
    private val service: SmtpTokenService,
    private val params: SmtpTokenListParams,
    private val response: CollectionResponseSmtpApiTokenViewForwardPaging,
) : Page<SmtpApiTokenView> {

    /**
     * Delegates to [CollectionResponseSmtpApiTokenViewForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseSmtpApiTokenViewForwardPaging.results
     */
    fun results(): List<SmtpApiTokenView> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseSmtpApiTokenViewForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseSmtpApiTokenViewForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<SmtpApiTokenView> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): SmtpTokenListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): SmtpTokenListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SmtpApiTokenView> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SmtpTokenListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseSmtpApiTokenViewForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SmtpTokenListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SmtpTokenListPage]. */
    class Builder internal constructor() {

        private var service: SmtpTokenService? = null
        private var params: SmtpTokenListParams? = null
        private var response: CollectionResponseSmtpApiTokenViewForwardPaging? = null

        @JvmSynthetic
        internal fun from(smtpTokenListPage: SmtpTokenListPage) = apply {
            service = smtpTokenListPage.service
            params = smtpTokenListPage.params
            response = smtpTokenListPage.response
        }

        fun service(service: SmtpTokenService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SmtpTokenListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseSmtpApiTokenViewForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SmtpTokenListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SmtpTokenListPage =
            SmtpTokenListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SmtpTokenListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SmtpTokenListPage{service=$service, params=$params, response=$response}"
}
